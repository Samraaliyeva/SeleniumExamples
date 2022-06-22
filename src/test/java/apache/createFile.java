package apache;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class createFile {

    public static void main(String[] args) throws IOException {

        HSSFWorkbook workbook=new HSSFWorkbook();
       HSSFSheet sheet= workbook.createSheet();

       sheet.createRow(0);
       sheet.getRow(0).createCell(0).setCellValue("ciao");
        sheet.getRow(0).createCell(1).setCellValue("mondo");

        sheet.createRow(1);
        sheet.getRow(1).createCell(0).setCellValue("hello");
        sheet.getRow(1).createCell(1).setCellValue("world ");


        File f=new File("C:\\Users\\SamraAliyeva\\Downloads\\ExcelFiles.xls");
        workbook.write(f);
        workbook.close();
    }
}
