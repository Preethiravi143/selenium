package workout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitiation {

	public static void main(String[] args) {
		 WebDriver webDriver = new ChromeDriver();
		 webDriver.get("https://www.facebook.com/");
		 String title = webDriver.getTitle();
//		 System.out.println(title.concat(title));
//		 webDriver.close();
//		 webDriver.quit();
//	    System.out.println(webDriver.getCurrentUrl());	
//	
	}

}