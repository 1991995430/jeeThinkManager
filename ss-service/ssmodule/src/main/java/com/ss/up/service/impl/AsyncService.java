package com.ss.up.service.impl;

import org.csource.common.MyException;
import org.csource.fastdfs.StorageClient1;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public interface AsyncService {

    void downLoad(StorageClient1 storageClient, String downLoadUrl) throws MyException, IOException;

    void excelExport(HttpServletResponse response);
}
