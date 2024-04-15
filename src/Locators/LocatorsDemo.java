package Locators;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LocatorsDemo {
	public static void main(String[] args) { 
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	//driver.get("https://www.yahoo.com/");	
	//driver.findElement(By.name("q")).sendKeys("mobiles");
	driver.getTitle();
	//driver1.sendKeys("maven repositery");
	//driver1.click();
	//driver.findElement(By.name("truncate")).sendKeys("Kumari@12345");
	//driver.findElement(By.name("login")).click();
	//driver.findElement(By.linkText("Forgotten password?")).click();
	//driver.quit();truncate
	//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kumaripeta1998.com");
	}
	///html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]
}

