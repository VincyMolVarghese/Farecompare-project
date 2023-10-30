package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.saucedemopage;

public class saucedemotest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver(); 	
}
@BeforeMethod
public void url()
{
	driver.get("https://www.saucedemo.com/");
}
@Test
public void test()
{
	saucedemopage ob=new saucedemopage(driver);
	driver.manage().window().maximize();
	ob.Login("standard_user", "secret_sauce");
	ob.Product();
	ob.Cart();
	ob.Checkout("vincy","varghese","123");
	ob.Backtohome();
}
}
