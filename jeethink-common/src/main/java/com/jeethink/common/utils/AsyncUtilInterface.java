package com.jeethink.common.utils;

import org.csource.common.MyException;
import org.csource.fastdfs.StorageClient1;

import java.io.IOException;


public interface AsyncUtilInterface {

    void downLoad(StorageClient1 storageClient, String downLoadUrl) throws MyException, IOException;

}
