package com.jeethink.web.core.config;

import org.csource.common.MyException;
import org.csource.fastdfs.StorageClient1;
import org.springframework.scheduling.annotation.Async;

import java.io.FileOutputStream;
import java.io.IOException;

public class AsyncUtils {


    @Async("taskExecutor")
    public void downLoad1(StorageClient1 storageClient, String downLoadUrl) throws MyException, IOException {
        System.out.println("异步任务开始。。。");
        //下载
        byte[] bytes = storageClient.download_file1(downLoadUrl);
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\fastdfs\\销售车位台账009.xlsx");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
        System.out.println("异步任务结束。。。");
    }
}
