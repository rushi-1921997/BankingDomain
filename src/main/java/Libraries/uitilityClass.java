package Libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class uitilityClass 
{
//get TD (00)
// Author name = @Rishin
// getTD takes two arguments like roeIndex,cellIndex
//getTD used to fetch the data from excelSheet
	
//use static method and datatType string
	
public static String getTD(int rowIndex, int CellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("E:\\ScreeShots Selenium\\Book1.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("sheet1");
		String value = sh.getRow(rowIndex).getCell(CellIndex).getStringCellValue();
		return value;
	}

public static void screenShot(WebDriver driver, int TestCaseID) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\Users\\hp\\eclipse-Selenium_Java\\upstox\\ScreenShots"+TestCaseID+"jpg");
	FileHandler.copy(src, dest);
}

public static String getDataFromPF(String key) throws IOException
{
	FileInputStream file= new FileInputStream("C:\\Users\\hp\\eclipse-Selenium_Java\\upstox\\upstox.properties");
	Properties p = new Properties();
	p.load(file); //to load the file
	String value = p.getProperty(key); // to get the string type data from PF
	return value;
}
}
	
