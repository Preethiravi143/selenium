package workout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class BrowserInitiation {

	public static void main(String[] args) {
		 WebDriver webDriver = new ChromeDriver();
		 webDriver.get("https://www.facebook.com/");
		 String title = webDriver.getTitle();
		FluentWait<WebDriver> wait = new FluentWait <WebDriver>(webDriver);
//		 System.out.println(title.concat(title));
//		 webDriver.close();
//		 webDriver.quit();
//	    System.out.println(webDriver.getCurrentUrl());	
//	
	}

}