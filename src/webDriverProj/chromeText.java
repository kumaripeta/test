package webDriverProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumari\\downloads\\browserDriver\\chromedriver-win64\\chromedriver.exe" );
		
		ChromeOptions cop =new ChromeOptions();
		cop.setBinary("C:\\Users\\kumari\\downloads\\browserDriver\\chrome-win64\\chrome.exe");
		
		WebDriver dr =new ChromeDriver(cop);
		dr.get("https://www.yahoo.com/");

	}

}
