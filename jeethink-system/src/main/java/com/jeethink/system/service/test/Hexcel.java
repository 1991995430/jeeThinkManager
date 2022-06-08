package com.jeethink.system.service.test;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Hexcel {

    public static void main(String[] args) {
        InputStream explain = null;
        try {
            explain = new FileInputStream("D:\\Program Files\\project\\jeethink-system\\src\\main\\resources\\static\\registerOrderHouseBase.xls");
            HSSFWorkbook wk = new HSSFWorkbook(explain);
            Sheet sheet = wk.getSheetAt(0);
            CellStyle cellStyle = sheet.getRow(2).getCell(0).getCellStyle();
            System.out.println("");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
