package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dummy {
	public static void main(String[] args) {
		//chrome launch
		//chrome.exe
		
		  WebDriver driver=new ChromeDriver(); driver.get("https://www.flipkart.com/");
		  System.out.println(driver.getTitle());//print the page title.
		  System.out.println(driver.getCurrentUrl());//print current url
		  driver.close();
		 
		//quit entire browser.
		//firefox lauch
		//geckodriver
		//webdriver.gecko.driver
		WebDriver driverfox=new FirefoxDriver();
		driverfox.get("https://www.flipkart.com/");
		System.out.println(driverfox.getTitle());//print the page title.
		System.out.println(driverfox.getCurrentUrl());//print current url
		driverfox.close();
		//quit entire browser.
		WebDriver driveredge=new EdgeDriver();
		driveredge.get("https://www.flipkart.com/");
		System.out.println(driveredge.getTitle());//print the page title.
		System.out.println(driveredge.getCurrentUrl());//print current url
		driveredge.close();
		driveredge.quit();//quit entire browser.
	}

}
