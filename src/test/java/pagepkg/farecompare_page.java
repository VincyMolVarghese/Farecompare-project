package pagepkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class farecompare_page {
	WebDriver driver;
	By loginheading=By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]/div[1]/ul/li[1]/a");
	By createacc=By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]/div[1]/ul/li[2]/a");
	By loginlink=By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]/div[2]/div[5]/a");
	By name=By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]/div[2]/label[1]/span[1]");
	By mail=By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]/div[2]/label[2]/input");
	By pass=By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]/div[2]/label[3]/span[1]");
	By createaccount=By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]/div[2]/button");
	By email=By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]/div[2]/label[1]/input");
	By password=By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]/div[2]/label[2]");
	By loginbutton=By.xpath("//*[@id=\"modal\"]/div/div/div/div[2]/div[2]/button");
	By flights=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[1]/div[2]/ul/li[1]/a");
	By hotels=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[1]/div[2]/ul/li[2]/a");
	By cars=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[1]/div[2]/ul/li[3]/a");
	By accounts=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[1]/div[2]/ul/li[6]/span");
	By logo=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[1]/div[2]/a/div/img[1]");
	By mytrips=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[1]/div[2]/ul/li[6]/ul/li[4]/a");
	By departdate=By.xpath("//*[@id=\"flights-calendar-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div");
	By returndate=By.xpath("//*[@id=\"flights-calendar-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div");
	By signup=By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[1]/div[2]/ul/li[6]/ul/li[6]/span");
	By leftarrow=By.xpath("//*[@id=\"flights-calendar-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div/div/div[1]/span[1]");
	By year=By.xpath("//*[@id=\"flights-calendar-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div");
	
	public farecompare_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void titleverification() {
		String title=driver.getTitle();
		String t="farecompare";
		if(title.equals(t)) {
			System.out.println("title same");
		}
		else {
			System.out.println("title different");
		}
	}
	public void contentverification() {
		String content=driver.getPageSource();
		if(content.contains("farecompare")) {
			System.out.println("contains");
		}
		else {
			System.out.println("not contains");
		}
	}
	public void logodisplay() {
		WebElement ob=driver.findElement(logo);
		boolean b=ob.isDisplayed();
		if(b) {
			System.out.println("logo displayed");
		}
		else {
			System.out.println("logo not displayed");
		}
	}
	public void screenshot() throws IOException   
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\Asus\\Desktop\\VINCY\\screenshot\\scrnsht.png"));
	}
	
	
	public void scrol()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
	}
	public void mouseover( ) {
		Actions act=new Actions(driver);
		WebElement we=driver.findElement(accounts);
		act.moveToElement(we);
		act.perform();
		driver.findElement(signup).click();
	}
	
	public void datadrivenlogin() throws IOException {
	driver.findElement(loginheading).click();
	File f=new File ("C:\\Users\\Asus\\Desktop\\farecompare2.xlsx");
	FileInputStream fi=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet sh=wb.getSheet("Sheet1");
	System.out.println(sh.getLastRowNum());
	
	for(int i=1;i<=sh.getLastRowNum();i++)
	{
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println(username);
		String pswd=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(pswd);
		
		driver.findElement(email).sendKeys(username);
		driver.findElement(password).sendKeys(pswd);
		driver.findElement(loginbutton).click();
	}
	}
	
	

}
