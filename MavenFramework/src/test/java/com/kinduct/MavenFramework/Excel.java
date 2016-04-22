package com.kinduct.MavenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class Excel {
	//public static void main(String[] args) throws Exception
	
	public  void excelpatient(int start,int end,String status) throws Exception
	{
		
		File clinic = new File("/Users/abhatnagar/Documents/workspace/MavenFramework/clinic2.xlsx");
		
		FileInputStream file = new FileInputStream(clinic);
			
		
		XSSFWorkbook wb =new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheetAt(4);
		
		//String data0 = sheet.getRow(1).getCell(5).getStringCellValue();
		
		//System.out.println(data0);
		
		//int rowcount = sheet.getLastRowNum();
		
		for (int i=start;i<end;i++)
			
		{
			
			sheet.getRow(i).createCell(4).setCellValue(status);
			
		}
		FileOutputStream fout = new FileOutputStream(clinic);
		
		
		
		wb.write(fout);
		
		//wb.close();
		
		
	}
	public  void excel(int start,int end,String status) throws Exception
	{
		
		File clinic = new File("/Users/abhatnagar/Documents/workspace/MavenFramework/clinic2.xlsx");
		
		FileInputStream file = new FileInputStream(clinic);
			
		
		XSSFWorkbook wb =new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheetAt(1);
		
		//String data0 = sheet.getRow(1).getCell(5).getStringCellValue();
		
		//System.out.println(data0);
		
		//int rowcount = sheet.getLastRowNum();
		
		for (int i=start;i<end;i++)
			
		{
			
			sheet.getRow(i).createCell(5).setCellValue(status);
			
		}
		FileOutputStream fout = new FileOutputStream(clinic);
		
		
		
		wb.write(fout);
		
		//wb.close();
		
		
	}

}
