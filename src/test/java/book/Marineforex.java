package book;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Marineforex {
	WebDriver driver;
	By leaving=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[1]/div/div[1]/div/div");
	By going=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[1]/div/div[2]/div/div");
	By depart=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[2]/div[2]/div/div/input");
	By arrow=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/button");
	By year=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div/div[125]/button");
	By month=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/div");
	By date=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[5]/div[3]/button");
	By travellers=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/div");
	By adult=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[1]/div/div/div[3]/p");
	By child=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[2]/div/div/div[3]/p");
	By bussiness=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[4]/div/div[1]/fieldset/div/label[2]/span[1]/span[1]/input");
	By done=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[3]/ul/li/ul/li[4]/div/div[2]");
	By search=By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[4]/input");
	By rightarrow=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[2]/button[2]");
			
	
	
	public Marineforex(WebDriver driver)
	{
     this.driver=driver;
	}
	
	public void leavinggoing()
	{
		driver.findElement(leaving).click();
		driver.findElement(going).click();
	}
	
	public void depart()
	{
	driver.findElement(depart).click();
	driver.findElement(arrow).click();
	driver.findElement(year).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	while(true)
	{
		WebElement mont=driver.findElement(month);
		String mo=mont.getText();
		if(mo.equals("November"))
		{
			System.out.println(mo);
		
		break;
	}
	else
	{
		driver.findElement(rightarrow).click();
	}
	}
	List<WebElement>days=driver.findElements(date);
	for(WebElement d:days) {
		System.out.println(d.getText());
		if(d.getText().equals("26"))
		{
			d.click();
			break;
		}
	}
	}
	
	public void travellers()
	{
		driver.findElement(travellers).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(adult).click();
		driver.findElement(child).click();
		driver.findElement(bussiness).click();
		driver.findElement(done).click();
	}
	
	public void searchh()
	{
		driver.findElement(search).click();
	}
	}


