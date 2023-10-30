package testpkg;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.farecompare_page;

public class farecompare_test {
WebDriver driver;

@BeforeTest
public void setup() {
	driver=new ChromeDriver();
}

@BeforeMethod
public void url() {
	driver.get("https://www.farecompare.com/");
}
@Test
public void test() throws IOException, AWTException   {
	farecompare_page fc=new farecompare_page(driver);
	driver.manage().window().maximize(); 
	fc.titleverification();
	fc.contentverification();
	fc.logodisplay(); 	
	fc.screenshot();
	fc.scrol();
	fc.mouseover();
	fc.datadrivenlogin();
	}
}
