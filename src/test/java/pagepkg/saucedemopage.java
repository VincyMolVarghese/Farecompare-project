package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class saucedemopage {
WebDriver driver;
By username=By.xpath("//*[@id=\"user-name\"]");
By password=By.xpath("//*[@id=\"password\"]");
By login=By.xpath("//*[@id=\"login-button\"]");
By Bag=By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
By Light=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
By Tshirt=By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
By Jacket=By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
By Onesie=By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
By RedTshirt=By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
By Cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
By Checkout=By.xpath("//*[@id=\"checkout\"]");
By Firstname=By.xpath("//*[@id=\"first-name\"]");
By Lastname=By.xpath("//*[@id=\"last-name\"]");
By Zipcode=By.xpath("//*[@id=\"postal-code\"]");
By Continue=By.xpath("//*[@id=\"continue\"]");
By Home=By.xpath("//*[@id=\"react-burger-menu-btn\"]");
By Logout=By.xpath("//*[@id=\"logout_sidebar_link\"]");

public saucedemopage(WebDriver driver)
{
	this.driver=driver;
}
public void Login(String user, String pswd)
{
	driver.findElement(username).sendKeys(user);
	driver.findElement(password).sendKeys(pswd);
	driver.findElement(login).click();
}
public void Product()
{
	driver.findElement(Bag).click();
	driver.findElement(Light).click();
	driver.findElement(Tshirt).click();
	driver.findElement(Jacket).click();
	driver.findElement(Onesie).click();
	driver.findElement(RedTshirt).click(); 	
}
public void Cart()
{
	driver.findElement(Cart).click();
}
public void Checkout(String firstname, String lastname, String zipcode)
{
	driver.findElement(Checkout).click();
	driver.findElement(Firstname).click();
	driver.findElement(Lastname).click();
	driver.findElement(Zipcode).click();
	driver.findElement(Continue).click();
}
public void Backtohome()
{
	driver.navigate().back();
	driver.findElement(Home).click();
	driver.findElement(Logout).click();
}
}
