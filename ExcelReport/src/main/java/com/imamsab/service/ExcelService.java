package com.imamsab.service;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imamsab.entity.Course;
// com.imamsab.importentity.ExcelEntity;
import com.imamsab.repo.ExcellRepository;

@Service
public class ExcelService {
	@Autowired
	private ExcellRepository repo;

	public void generatedExcel() {
		List<Course> findAll = repo.findAll();

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("EmployeeInfo");
		XSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("eno");
		row.createCell(1).setCellValue("ename");
		row.createCell(2).setCellValue("dept");
		int dataRowIndex = 1;
		for (Course data : findAll) {
			XSSFRow row1 = sheet.createRow(dataRowIndex);
			// Course course = null;
			row1.createCell(0).setCellValue(data.getEno());
			row1.createCell(1).setCellValue(data.getEname());
			row1.createCell(2).setCellValue(data.getDept());
			dataRowIndex++;

		}

		try {
			FileOutputStream fis = new FileOutputStream("C:\\ExcelFile\\emp.xlsx");

			workbook.write(fis);
			workbook.close();
			fis.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
