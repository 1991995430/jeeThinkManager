package com.ss.up.service;

import com.ss.up.dto.HeadDto;
import com.ss.up.dto.ResExtDto;
import com.ss.up.enums.SystemServiceTypeE;
import com.ss.up.mapper.ResExtMapper;
import com.ss.up.model.ResExt;
import com.ss.up.model.ResExtCriteria;
import com.ss.up.service.impl.AsyncService;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.*;
import org.csource.common.MyException;
import org.csource.fastdfs.StorageClient1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@Service
public class AsyncServiceImpl implements AsyncService {

    @Autowired
    private ResExtMapper resExtMapper;


    @Async("taskExecutor")
    public void downLoad(StorageClient1 storageClient, String downLoadUrl) throws MyException, IOException {
        System.out.println("异步任务开始。。。");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //下载
        byte[] bytes = storageClient.download_file1(downLoadUrl);
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\fastdfs\\车位台账20220920143303.xls");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
        System.out.println("异步任务结束。。。");
    }


    public void excelExport(HttpServletResponse response) {

        List<Integer> idList = new ArrayList<>();
        idList.add(150090081);
        idList.add(150090082);
        idList.add(150090083);
        ResExtCriteria resExtExample = new ResExtCriteria();
        resExtExample.createCriteria().andIdIn(idList);
        List<ResExt> resExtList = resExtMapper.selectByExample(resExtExample);
        List<ResExtDto> resultList = new ArrayList<>();
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        for (ResExt resExt : resExtList) {
            ResExtDto resExtDto = mapper.map(resExt, ResExtDto.class);
            resultList.add(resExtDto);
        }

        //写入数据
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("测试信息");
        //设置表头样式
        XSSFCellStyle cellStyle = workbook.createCellStyle();
        //给样式设置对齐方式（左对齐）
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_LEFT);
        List<HeadDto> headList = getHeadList();
        //设置列宽
        int l = 0;
        for (int i = 0; i < headList.size(); i++) {
            sheet.setColumnWidth(l, 24 * 256);
            l++;
        }
        //字体颜色
        Font font = workbook.createFont();
        font.setColor(Font.COLOR_RED);
        cellStyle.setFont(font);
        cellStyle.setWrapText(true);
        //设置表头数据
        XSSFRow rowHead = sheet.createRow(0);
        setRowHead(headList, rowHead, headList.size());

        for (int i = 0; i < resultList.size(); i++) {
            XSSFRow row = sheet.createRow(i + 1);
            //给每一行的所有列赋值
            ResExtDto dto = resultList.get(i);
            for (int j = 0; j < headList.size(); j++) {
                String code = headList.get(j).getColId();
                Field field;
                try {
                    field = dto.getClass().getDeclaredField(code);
                    field.setAccessible(true);
                    XSSFCell cell = row.createCell(j);
                    if (null != field.get(dto)) {
                        cell.setCellValue(field.get(dto).toString());
                    } else {
                        cell.setCellValue("");
                    }
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }


        String fileName = "测试excel导出.xls";
        try {
            fileName = URLEncoder.encode(fileName, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.addHeader("Content-Disposition", "attachment:filename=" + fileName);
        response.setContentType("application/msexcel");

        try {
            workbook.write(response.getOutputStream());
            response.getOutputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //导入至FastDFS
        /*ByteArrayOutputStream excelOutputStream = new ByteArrayOutputStream();
        String excelUrl = null;
        try {
            workbook.write(excelOutputStream);
            //excelUrl = FastDFSUtils.uploadFile(excelOutputStream.toByteArray(), "xls");
            //logger.info("车位台账列表导出上传的路径为:" + excelUrl);
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
    }

    private List<HeadDto> getHeadList() {
        return new ArrayList<HeadDto>() {{
            add(new HeadDto("id", "资源编号"));
            add(new HeadDto("resId", "资源ID"));
            add(new HeadDto("organName", "所属项目"));
            add(new HeadDto("createUserId", "用户ID"));
            add(new HeadDto("createUserName", "用户名称"));
            add(new HeadDto("resName", "资源名称"));
            add(new HeadDto("buildName", "楼栋名称"));
            add(new HeadDto("parkName", "车场名称"));
        }};
    }

    private void setRowHead(List<HeadDto> headList, XSSFRow rowHead, Integer size) {
        for (int i = 0; i < size; i++) {
            rowHead.createCell(i).setCellValue(headList.get(i).getColName());
        }
    }
}
