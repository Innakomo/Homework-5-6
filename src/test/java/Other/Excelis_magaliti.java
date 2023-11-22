package Other;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class Excelis_magaliti {
    @Test
    public void excel() throws IOException, BiffException {
        String filePath = "files\\Test.xls";
        FileInputStream fs = new FileInputStream(filePath);
        Workbook wb = Workbook.getWorkbook(fs);
        Sheet sheet = wb.getSheet("Sheet1");
        int totalNoOfRows = sheet.getRows();
        for (int row = 1; row < totalNoOfRows; row++){
            String value = sheet.getCell(0,row).getContents();
            System.out.println(value);
        }
    }
}
