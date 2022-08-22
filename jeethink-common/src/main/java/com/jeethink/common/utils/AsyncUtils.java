package com.jeethink.common.utils;

import org.csource.common.MyException;
import org.csource.fastdfs.StorageClient1;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class AsyncUtils implements AsyncUtilInterface{


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
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\fastdfs\\日志022.txt");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
        System.out.println("异步任务结束。。。");
    }
}
