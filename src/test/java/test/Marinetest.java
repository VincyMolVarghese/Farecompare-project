package test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import book.Marineforex;

public class Marinetest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver =new ChromeDriver();
	}

	@BeforeMethod
	public void url()
	{
		driver.get("https://marinersforex.com/Flights-Booking");
	}
	
	@Test
	public void test()
	{
		Marineforex ob=new Marineforex(driver);
		driver.manage().window().maximize();
		ob.leavinggoing();
		ob.depart();
		ob.travellers();
		ob.searchh();

		
	}
	
}


