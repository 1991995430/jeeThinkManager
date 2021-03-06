package com.jeethink.common.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import com.jeethink.common.core.text.StrFormatter;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.apache.commons.collections4.CollectionUtils;
import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;
import segi.common.user.rel.PaginatorICE;

/**
 * 字符串工具类
 * 
 * @author jeethink  
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils
{
    /** 空字符串 */
    private static final String NULLSTR = "";

    /** 下划线 */
    private static final char SEPARATOR = '_';

    /**
     * 获取参数不为空值
     * 
     * @param value defaultValue 要判断的value
     * @return value 返回值
     */
    public static <T> T nvl(T value, T defaultValue)
    {
        return value != null ? value : defaultValue;
    }

    /**
     * * 判断一个Collection是否为空， 包含List，Set，Queue
     * 
     * @param coll 要判断的Collection
     * @return true：为空 false：非空
     */
    public static boolean isEmpty(Collection<?> coll)
    {
        return isNull(coll) || coll.isEmpty();
    }

    /**
     * * 判断一个Collection是否非空，包含List，Set，Queue
     * 
     * @param coll 要判断的Collection
     * @return true：非空 false：空
     */
    public static boolean isNotEmpty(Collection<?> coll)
    {
        return !isEmpty(coll);
    }

    @Test
    public void aa () {
        try {
            ClientGlobal.initByProperties("fastdfs.properties");
            TrackerClient trackerClient = new TrackerClient();
            //根据tracker客户端创建连接,获取到跟踪服务器对象
            TrackerServer trackerServer = trackerClient.getConnection();
            StorageServer storageServer = null;
            //定义storage客户端
            StorageClient1 storageClient1 = new StorageClient1(trackerServer, storageServer);
            //文件元信息
            NameValuePair[] nameValuePairs = new NameValuePair[1];
            nameValuePairs[0] = new NameValuePair("fileName", "销售车位台账001.xlsx");
            //上传,返回fileId
            String fileId = storageClient1.upload_file1("D:\\fastdfs\\销售车位台账001.xlsx", "xlsx", nameValuePairs);
            System.out.println(fileId);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testQuery() throws IOException, MyException {
        //加载配置文件
        ClientGlobal.initByProperties("fastdfs.properties");
        //创建tracker客户端
        TrackerClient trackerClient = new TrackerClient();
        //根据tracker客户端创建连接,获取到跟踪服务器对象
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageServer storageServer = null;
        //定义storage客户端
        StorageClient1 storageClient1 = new StorageClient1(trackerServer, storageServer);
        //查询文件信息
        FileInfo fileInfo = storageClient1.query_file_info1("group1/M0A/00/7A/wKgBB2K76UOATNp7ABtltZzzoTA75.xlsx");
        System.out.println(fileInfo);
    }

    @Test
    public void testDownload() throws IOException, MyException {
        //加载配置文件
        ClientGlobal.initByProperties("fastdfs.properties");
        //创建tracker客户端
        TrackerClient trackerClient = new TrackerClient();
        //根据tracker客户端创建连接
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageServer storageServer = null;
        //定义storage客户端
        StorageClient1 storageClient = new StorageClient1(trackerServer, storageServer);

        String downLoadUrl = "group1/M0A/00/7A/wKgBB2K76UOATNp7ABtltZzzoTA75.xlsx";
        // downLoad(storageClient, downLoadUrl);
        System.out.println("下载中，请稍后查看。。。");
    }

    public static void main(String[] args) throws MyException, IOException {
        //加载配置文件
        ClientGlobal.initByProperties("fastdfs.properties");
        //创建tracker客户端
        TrackerClient trackerClient = new TrackerClient();
        //根据tracker客户端创建连接
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageServer storageServer = null;
        //定义storage客户端
        StorageClient1 storageClient = new StorageClient1(trackerServer, storageServer);

        String downLoadUrl = "group1/M0A/00/7A/wKgBB2K76UOATNp7ABtltZzzoTA75.xlsx";
        AsyncUtils asyncUtils = new AsyncUtils();
        asyncUtils.downLoad(storageClient, downLoadUrl);

        /*new Thread(() -> {
            System.out.println("异步任务开始。。。");
            //下载
            byte[] bytes;
            try {
                bytes = storageClient.download_file1(downLoadUrl);
                FileOutputStream fileOutputStream = new FileOutputStream("D:\\fastdfs\\销售车位台账010.xlsx");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (IOException | MyException e) {
                e.printStackTrace();
            }
            System.out.println("异步任务结束。。。");
        }).start();*/
        System.out.println("下载中，请稍后查看1111。。。");
    }



    @Test
    public void test1() {
        /*List<Long> houseIdList = new ArrayList<>();
        houseIdList.add(11L);
        houseIdList.add(13L);
        houseIdList.add(15L);
        houseIdList.add(12L);
        System.out.println(new BigDecimal("25.32"));
        System.out.println(StringUtils.join(houseIdList, ","));*/

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        stuResInfoV2  s = new stuResInfoV2();
        s.setLandArea("25.36");
        // ResExt resExt = new ResExt();
        ResExt resExt = mapper.map(s, ResExt.class);
        if (s.getLandArea() != null) {
            resExt.setLandArea(new BigDecimal(s.getLandArea()));
        }

        BeanUtils.copyProperties(s, resExt);
        System.out.println(resExt.getLandArea());
    }

    @Test
    public void test062901() {

        ResUseDirectionReportDto res1 = new ResUseDirectionReportDto();
        res1.setSecondCompanyName("北海1");
        res1.setCity("南京");
        res1.setCommunityId(112L);
        res1.setIdleCount(12);
        res1.setRentedCount(18);
        res1.setUnRentedCount(16);
        res1.setHelpOneselfCount(11);

        ResUseDirectionReportDto res7 = new ResUseDirectionReportDto();
        res7.setSecondCompanyName("北海6");
        res7.setCity("南京");
        res7.setCommunityId(113L);
        res7.setIdleCount(1);
        res7.setRentedCount(1);
        res7.setUnRentedCount(1);
        res7.setHelpOneselfCount(1);

        ResUseDirectionReportDto res2 = new ResUseDirectionReportDto();
        res2.setSecondCompanyName("北海2");
        res2.setCity("南京");
        res2.setCommunityId(113L);
        res2.setIdleCount(1);
        res2.setRentedCount(15);
        res2.setUnRentedCount(16);
        res2.setHelpOneselfCount(17);

        ResUseDirectionReportDto res9 = new ResUseDirectionReportDto();
        res9.setSecondCompanyName("北海6");
        res9.setCity("南京");
        res9.setCommunityId(113L);
        res9.setIdleCount(88);
        res9.setRentedCount(88);
        res9.setUnRentedCount(88);
        res9.setHelpOneselfCount(88);

        ResUseDirectionReportDto res4 = new ResUseDirectionReportDto();
        res4.setSecondCompanyName("北海1");
        res4.setCity("南京");
        res4.setCommunityId(113L);
        res4.setIdleCount(1);
        res4.setRentedCount(15);
        res4.setUnRentedCount(16);
        res4.setHelpOneselfCount(17);

        ResUseDirectionReportDto res8 = new ResUseDirectionReportDto();
        res8.setSecondCompanyName("中海2");
        res8.setCity("广东");
        res8.setCommunityId(113L);
        res8.setIdleCount(22);
        res8.setRentedCount(15);
        res8.setUnRentedCount(16);
        res8.setHelpOneselfCount(17);

        ResUseDirectionReportDto res5 = new ResUseDirectionReportDto();
        res5.setSecondCompanyName("北海2");
        res5.setCity("南京");
        res5.setCommunityId(113L);
        res5.setIdleCount(1);
        res5.setRentedCount(15);
        res5.setUnRentedCount(16);
        res5.setHelpOneselfCount(17);

        ResUseDirectionReportDto res10 = new ResUseDirectionReportDto();
        res10.setSecondCompanyName("中海1");
        res10.setCity("广东");
        res10.setCommunityId(113L);
        res10.setIdleCount(22);
        res10.setRentedCount(15);
        res10.setUnRentedCount(16);
        res10.setHelpOneselfCount(17);

        ResUseDirectionReportDto res6 = new ResUseDirectionReportDto();
        res6.setSecondCompanyName("北海6");
        res6.setCity("南京");
        res6.setCommunityId(113L);
        res6.setIdleCount(1);
        res6.setRentedCount(15);
        res6.setUnRentedCount(16);
        res6.setHelpOneselfCount(17);
        ResUseDirectionReportDto res0 = new ResUseDirectionReportDto();
        res6.setSecondCompanyName("北海77");
        res6.setCity("南京111");
        res6.setCommunityId(113L);
        res6.setIdleCount(1);
        res6.setRentedCount(15);
        res6.setUnRentedCount(16);
        res6.setHelpOneselfCount(17);


        ResUseDirectionReportDto res3 = new ResUseDirectionReportDto();
        res3.setSecondCompanyName("中海1");
        res3.setCity("广东");
        res3.setCommunityId(113L);
        res3.setIdleCount(22);
        res3.setRentedCount(15);
        res3.setUnRentedCount(16);
        res3.setHelpOneselfCount(17);

        ResUseDirectionReportDto res11 = new ResUseDirectionReportDto();
        res11.setSecondCompanyName("中海1");
        res11.setCity("深圳");
        res11.setCommunityId(113L);
        res11.setIdleCount(22);
        res11.setRentedCount(15);
        res11.setUnRentedCount(16);
        res11.setHelpOneselfCount(17);

        List<ResUseDirectionReportDto> list = new ArrayList<>();
        list.add(res1);
        list.add(res2);
        list.add(res3);
        list.add(res4);
        list.add(res5);
        list.add(res6);
        list.add(res7);
        list.add(res8);
        list.add(res9);
        list.add(res10);
        list.add(res11);

        List<Integer> aa1 = new ArrayList<>();
        aa1.add(23);
        aa1.add(1);
        aa1.add(26);
        System.out.println(aa1.stream().sorted().collect(Collectors.toList()));


        for (int i = 0; i < list.size() ; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getSecondCompanyName().equals(list.get(j).getSecondCompanyName()) && list.get(i).getCity().equals(list.get(j).getCity())) {
                    setNewCount(list.get(j), list.get(i));
                    list.remove(j);
                }
            }
        }

        System.out.println(list.stream()
                .sorted(Comparator.comparing(ResUseDirectionReportDto::getSecondCompanyName)).collect(Collectors.toList()));

        List<ResUseDirectionReportDto> aa = new ArrayList<>();
        List<ResUseDirectionReportDto> ppp = new ArrayList<>();
        Map<String, ResUseDirectionReportDto> map = new HashMap<>();
        list.forEach(resUseDirection -> {
            if (map.containsKey(resUseDirection.getCity()) &&
                    map.get(resUseDirection.getCity()).getSecondCompanyName().equals(resUseDirection.getSecondCompanyName())) {
                // 同一个城市且上级分公司一致 数值叠加
                ResUseDirectionReportDto reportDtoNew = map.get(resUseDirection.getCity());
                setNewCount(resUseDirection, reportDtoNew);
            } else if (map.containsKey(resUseDirection.getCity()) &&
                    !map.get(resUseDirection.getCity()).getSecondCompanyName().equals(resUseDirection.getSecondCompanyName())) {
                List<ResUseDirectionReportDto> bb = aa.stream().filter(var0 -> var0.getSecondCompanyName().equals(resUseDirection.getSecondCompanyName())).collect(Collectors.toList());
                if (bb.size() > 0) {
                    setNewCount(resUseDirection, bb.get(0));
                } else {
                    aa.add(resUseDirection);
                }
            } else {
                map.put(resUseDirection.getCity(), resUseDirection);
            }
        });

        ppp.addAll(map.values());
        if (aa.size() > 0) {
            ppp.addAll(aa);
        }
        // System.out.println(aa);
        System.out.println("aaa");
    }

    @Test
    public void test0712 () {
        Date dateByStrDate = getDateByStrDate("2022-07-12");
        String date = "2022-07-12";
        StringBuilder bb = new StringBuilder();
        for (String aa : date.split("-")) {
            bb.append(aa);
        }
        System.out.println(bb);
    }

    public static Long getLongDate(Date date) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
        return Long.valueOf(fmt.format(date));
    }

    public static Date getDateByStrDate(String strDate) {
        return getDateByStrDate(strDate, "yyyy-MM-dd");
    }

    public static Date getDateByStrDate(String strDate,String pattern) {
        try {
            SimpleDateFormat fmt = new SimpleDateFormat(pattern);
            return fmt.parse(strDate);
        } catch (ParseException ex) {
            return null;
        }
    }

    private void setNewCount(ResUseDirectionReportDto resUseDirection, ResUseDirectionReportDto reportDtoNew) {
        reportDtoNew.setRentedCount(Math.addExact(reportDtoNew.getRentedCount() == null ? 0 : reportDtoNew.getRentedCount(), resUseDirection.getRentedCount() == null ? 0 : resUseDirection.getRentedCount()));
        reportDtoNew.setUnRentedCount(Math.addExact(reportDtoNew.getUnRentedCount() == null ? 0 : reportDtoNew.getUnRentedCount(), resUseDirection.getUnRentedCount() == null ? 0 : resUseDirection.getUnRentedCount()));
        reportDtoNew.setHelpOneselfCount(Math.addExact(reportDtoNew.getHelpOneselfCount() == null ? 0 : reportDtoNew.getHelpOneselfCount(), resUseDirection.getHelpOneselfCount() == null ? 0 : resUseDirection.getHelpOneselfCount()));
        reportDtoNew.setIdleCount(Math.addExact(reportDtoNew.getIdleCount() == null ? 0 : reportDtoNew.getIdleCount(), resUseDirection.getIdleCount() == null ? 0 : resUseDirection.getIdleCount()));
        reportDtoNew.setRentedStandardCount(Math.addExact(reportDtoNew.getRentedStandardCount() == null ? 0 : reportDtoNew.getRentedStandardCount(), resUseDirection.getRentedStandardCount() == null ? 0 : resUseDirection.getRentedStandardCount()));
        reportDtoNew.setUnRentedStandardCount(Math.addExact(reportDtoNew.getUnRentedStandardCount() == null ? 0 : reportDtoNew.getUnRentedStandardCount(), resUseDirection.getUnRentedStandardCount() == null ? 0 : resUseDirection.getUnRentedStandardCount()));
        reportDtoNew.setHelpOneselfStandardCount(Math.addExact(reportDtoNew.getHelpOneselfStandardCount() == null ? 0 : reportDtoNew.getHelpOneselfStandardCount(), resUseDirection.getHelpOneselfStandardCount() == null ? 0 : resUseDirection.getHelpOneselfStandardCount()));
        reportDtoNew.setIdleStandardCount(Math.addExact(reportDtoNew.getIdleStandardCount() == null ? 0 : reportDtoNew.getIdleStandardCount(), resUseDirection.getIdleStandardCount() == null ? 0 : resUseDirection.getIdleStandardCount()));
    }

    private void collectResData(List<ResUseDirectionReportDto> resUseDirectionReportDtoAll, List<ResUseDirectionReportDto> resUseDirectionStandardReportDto) {
        for (ResUseDirectionReportDto var0 : resUseDirectionReportDtoAll) {
            resUseDirectionStandardReportDto.forEach(var1 -> {
                if (var0.getCommunityId().equals(var1.getCommunityId())) {
                    var0.setIdleStandardCount(var1.getIdleStandardCount());
                    var0.setRentedStandardCount(var1.getRentedStandardCount());
                    var0.setUnRentedStandardCount(var1.getUnRentedStandardCount());
                    var0.setHelpOneselfStandardCount(var1.getHelpOneselfStandardCount());
                }
            });
        }
    }



    /**
     * * 判断一个对象数组是否为空
     * 
     * @param objects 要判断的对象数组
     ** @return true：为空 false：非空
     */
    public static boolean isEmpty(Object[] objects)
    {
        return isNull(objects) || (objects.length == 0);
    }

    /**
     * * 判断一个对象数组是否非空
     * 
     * @param objects 要判断的对象数组
     * @return true：非空 false：空
     */
    public static boolean isNotEmpty(Object[] objects)
    {
        return !isEmpty(objects);
    }

    /**
     * * 判断一个Map是否为空
     * 
     * @param map 要判断的Map
     * @return true：为空 false：非空
     */
    public static boolean isEmpty(Map<?, ?> map)
    {
        return isNull(map) || map.isEmpty();
    }

    /**
     * * 判断一个Map是否为空
     * 
     * @param map 要判断的Map
     * @return true：非空 false：空
     */
    public static boolean isNotEmpty(Map<?, ?> map)
    {
        return !isEmpty(map);
    }

    /**
     * * 判断一个字符串是否为空串
     * 
     * @param str String
     * @return true：为空 false：非空
     */
    public static boolean isEmpty(String str)
    {
        return isNull(str) || NULLSTR.equals(str.trim());
    }

    /**
     * * 判断一个字符串是否为非空串
     * 
     * @param str String
     * @return true：非空串 false：空串
     */
    public static boolean isNotEmpty(String str)
    {
        return !isEmpty(str);
    }

    /**
     * * 判断一个对象是否为空
     * 
     * @param object Object
     * @return true：为空 false：非空
     */
    public static boolean isNull(Object object)
    {
        return object == null;
    }

    /**
     * * 判断一个对象是否非空
     * 
     * @param object Object
     * @return true：非空 false：空
     */
    public static boolean isNotNull(Object object)
    {
        return !isNull(object);
    }

    /**
     * * 判断一个对象是否是数组类型（Java基本型别的数组）
     * 
     * @param object 对象
     * @return true：是数组 false：不是数组
     */
    public static boolean isArray(Object object)
    {
        return isNotNull(object) && object.getClass().isArray();
    }

    /**
     * 去空格
     */
    public static String trim(String str)
    {
        return (str == null ? "" : str.trim());
    }

    /**
     * 截取字符串
     * 
     * @param str 字符串
     * @param start 开始
     * @return 结果
     */
    public static String substring(final String str, int start)
    {
        if (str == null)
        {
            return NULLSTR;
        }

        if (start < 0)
        {
            start = str.length() + start;
        }

        if (start < 0)
        {
            start = 0;
        }
        if (start > str.length())
        {
            return NULLSTR;
        }

        return str.substring(start);
    }

    /**
     * 截取字符串
     * 
     * @param str 字符串
     * @param start 开始
     * @param end 结束
     * @return 结果
     */
    public static String substring(final String str, int start, int end)
    {
        if (str == null)
        {
            return NULLSTR;
        }

        if (end < 0)
        {
            end = str.length() + end;
        }
        if (start < 0)
        {
            start = str.length() + start;
        }

        if (end > str.length())
        {
            end = str.length();
        }

        if (start > end)
        {
            return NULLSTR;
        }

        if (start < 0)
        {
            start = 0;
        }
        if (end < 0)
        {
            end = 0;
        }

        return str.substring(start, end);
    }

    /**
     * 格式化文本, {} 表示占位符<br>
     * 此方法只是简单将占位符 {} 按照顺序替换为参数<br>
     * 如果想输出 {} 使用 \\转义 { 即可，如果想输出 {} 之前的 \ 使用双转义符 \\\\ 即可<br>
     * 例：<br>
     * 通常使用：format("this is {} for {}", "a", "b") -> this is a for b<br>
     * 转义{}： format("this is \\{} for {}", "a", "b") -> this is \{} for a<br>
     * 转义\： format("this is \\\\{} for {}", "a", "b") -> this is \a for b<br>
     * 
     * @param template 文本模板，被替换的部分用 {} 表示
     * @param params 参数值
     * @return 格式化后的文本
     */
    public static String format(String template, Object... params)
    {
        if (isEmpty(params) || isEmpty(template))
        {
            return template;
        }
        return StrFormatter.format(template, params);
    }

    /**
     * 字符串转set
     * 
     * @param str 字符串
     * @param sep 分隔符
     * @return set集合
     */
    public static final Set<String> str2Set(String str, String sep)
    {
        return new HashSet<String>(str2List(str, sep, true, false));
    }

    /**
     * 字符串转list
     * 
     * @param str 字符串
     * @param sep 分隔符
     * @param filterBlank 过滤纯空白
     * @param trim 去掉首尾空白
     * @return list集合
     */
    public static final List<String> str2List(String str, String sep, boolean filterBlank, boolean trim)
    {
        List<String> list = new ArrayList<String>();
        if (StringUtils.isEmpty(str))
        {
            return list;
        }

        // 过滤空白字符串
        if (filterBlank && StringUtils.isBlank(str))
        {
            return list;
        }
        String[] split = str.split(sep);
        for (String string : split)
        {
            if (filterBlank && StringUtils.isBlank(string))
            {
                continue;
            }
            if (trim)
            {
                string = string.trim();
            }
            list.add(string);
        }

        return list;
    }

    /**
     * 驼峰转下划线命名
     */
    public static String toUnderScoreCase(String str)
    {
        if (str == null)
        {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        // 前置字符是否大写
        boolean preCharIsUpperCase = true;
        // 当前字符是否大写
        boolean curreCharIsUpperCase = true;
        // 下一字符是否大写
        boolean nexteCharIsUpperCase = true;
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if (i > 0)
            {
                preCharIsUpperCase = Character.isUpperCase(str.charAt(i - 1));
            }
            else
            {
                preCharIsUpperCase = false;
            }

            curreCharIsUpperCase = Character.isUpperCase(c);

            if (i < (str.length() - 1))
            {
                nexteCharIsUpperCase = Character.isUpperCase(str.charAt(i + 1));
            }

            if (preCharIsUpperCase && curreCharIsUpperCase && !nexteCharIsUpperCase)
            {
                sb.append(SEPARATOR);
            }
            else if ((i != 0 && !preCharIsUpperCase) && curreCharIsUpperCase)
            {
                sb.append(SEPARATOR);
            }
            sb.append(Character.toLowerCase(c));
        }

        return sb.toString();
    }

    /**
     * 是否包含字符串
     * 
     * @param str 验证字符串
     * @param strs 字符串组
     * @return 包含返回true
     */
    public static boolean inStringIgnoreCase(String str, String... strs)
    {
        if (str != null && strs != null)
        {
            for (String s : strs)
            {
                if (str.equalsIgnoreCase(trim(s)))
                {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 将下划线大写方式命名的字符串转换为驼峰式。如果转换前的下划线大写方式命名的字符串为空，则返回空字符串。 例如：HELLO_WORLD->HelloWorld
     * 
     * @param name 转换前的下划线大写方式命名的字符串
     * @return 转换后的驼峰式命名的字符串
     */
    public static String convertToCamelCase(String name)
    {
        StringBuilder result = new StringBuilder();
        // 快速检查
        if (name == null || name.isEmpty())
        {
            // 没必要转换
            return "";
        }
        else if (!name.contains("_"))
        {
            // 不含下划线，仅将首字母大写
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        // 用下划线将原始字符串分割
        String[] camels = name.split("_");
        for (String camel : camels)
        {
            // 跳过原始字符串中开头、结尾的下换线或双重下划线
            if (camel.isEmpty())
            {
                continue;
            }
            // 首字母大写
            result.append(camel.substring(0, 1).toUpperCase());
            result.append(camel.substring(1).toLowerCase());
        }
        return result.toString();
    }

    /**
     * 驼峰式命名法 例如：user_name->userName
     */
    public static String toCamelCase(String s)
    {
        if (s == null)
        {
            return null;
        }
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s.length());
        boolean upperCase = false;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (c == SEPARATOR)
            {
                upperCase = true;
            }
            else if (upperCase)
            {
                sb.append(Character.toUpperCase(c));
                upperCase = false;
            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object obj)
    {
        return (T) obj;
    }
}