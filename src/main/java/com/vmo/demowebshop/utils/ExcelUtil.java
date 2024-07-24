package com.vmo.demowebshop.utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelUtil {
    private XSSFWorkbook wb;
    private XSSFSheet sh;
    private FileInputStream fileIn;
    private FileOutputStream fileOut;

    public ExcelUtil(String src, String test, String resources, String assignment) {
    }

    public void ExcelUtil(String ExcelPath, String SheetName) {
        try {
            File file = new File(ExcelPath);
            fileIn = new FileInputStream(file);
            wb = new XSSFWorkbook(fileIn);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ExcelUtil(String path) {
        try {
            File file = new File(path);
            fileIn = new FileInputStream(file);
            wb = new XSSFWorkbook(fileIn);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getRowNum() {
        sh = wb.getSheet("Test data");
        return sh.getLastRowNum();
    }

    public int getColNum() {
        sh = wb.getSheet("Test data");
        return sh.getRow(0).getLastCellNum();
    }

    public String getDataValue(int rowNum, int colNum) {
        sh = wb.getSheet("Test data");
        DataFormatter df = new DataFormatter();
        try {
            return df.formatCellValue(sh.getRow(rowNum).getCell(colNum));
        } catch (NullPointerException npe) {
            return "";
        }
    }

    public Object[][] data() {
        int rowNum = getRowNum();
        int colNum = getColNum();
        System.out.println("Row num: " + rowNum);
        System.out.println("Col num: " + colNum);
        Object[][] obj = new Object[rowNum][colNum];
        int currentRow = 0;
        for (int i = 1; i <= rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                obj[currentRow][j] = getDataValue(i, j);
            }
            currentRow++;
        }
        return obj;
    }
}