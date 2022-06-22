package apache;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) throws IOException {

        File filee=new File("C:\\Users\\SamraAliyeva\\Downloads\\ExcelFiles\\ExcelFiles.xls");
        FileInputStream fl=new FileInputStream(filee);
        HSSFWorkbook workbook=new HSSFWorkbook(fl);
        HSSFSheet sheet= workbook.getSheetAt(0);
        String cellvalue=sheet.getRow(0).getCell(0).getStringCellValue();
        System.out.println(cellvalue);

        workbook.close();
        fl.close();


    }
}
