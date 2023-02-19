package com.eurotech.pages;

import com.eurotech.utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class TestingExcel {
    public static void main(String[] args) {


        ExcelUtil excelUtil = new ExcelUtil("src/test/resources/EurotechTestLast.xls","Test Data");
        List<Map<String, String>> dataList = excelUtil.getDataList();

        System.out.println("dataList = " + dataList);
        System.out.println("dataList.get(4).get(\"Name\") = " + dataList.get(2).get("Name"));
        System.out.println("dataList.get(0).get(\"Company\") = " + dataList.get(0).get("Company"));

        System.out.println("dataList.get(3).get(\"Title\") = " + dataList.get(3).get("Title"));


    }
}
