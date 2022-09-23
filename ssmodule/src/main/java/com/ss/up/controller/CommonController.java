package com.ss.up.controller;

import com.ss.up.rest.RestResponse;
import com.ss.up.service.impl.AsyncService;
import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/ss/common")
@EnableAsync
public class CommonController {

    static {
        try {
            ClientGlobal.initByProperties("fastdfs.properties");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/downLoad")
    public RestResponse downLoad(@RequestParam String downLoadUrl) {

        //加载配置文件
        try {
            //创建tracker客户端
            TrackerClient trackerClient = new TrackerClient();
            //根据tracker客户端创建连接
            TrackerServer trackerServer = trackerClient.getConnection();
            StorageServer storageServer = null;
            //定义storage客户端
            StorageClient1 storageClient = new StorageClient1(trackerServer, storageServer);

            //String downLoadUrl = "group1/M17/00/7D/wKgBB2Mpk1CAKYktAAAQrwtYBq0179.xls";
            // AsyncUtils asyncUtils = new AsyncUtils();
            asyncService.downLoad(storageClient, downLoadUrl);
            System.out.println("下载中，请稍后查看。。。");
        } catch (IOException | MyException e) {
            e.printStackTrace();
        }


        return RestResponse.RestResponseBuilder.createSuccessBuilder().setResult("").buidler();
    }

    @GetMapping("/excelExport")
    public RestResponse excelExport(HttpServletResponse response) {
        System.out.println("开始导出。。。");
        asyncService.excelExport(response);
        System.out.println("导出结束。。。");
        return RestResponse.RestResponseBuilder.createSuccessBuilder().setResult("").buidler();
    }



}
