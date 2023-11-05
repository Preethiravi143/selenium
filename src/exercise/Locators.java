

package exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chrome.");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/java/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.className("tnb-login-btn")).click();
//		if there is id and classname attributes, we can generate css selector by this method-tagname#id and tagname.classname or else use below format
//		css selector format = Tagname[attribute='value']
//		xpath generation format = //Tagname[@attribute='value']
//		
//	  driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//	  driver.findElement(By.name("inputPassword")).sendKeys("he11012311");
//	  sendkeys(); is an important method to be know to pass value inside a html element.
//	  driver.findElement(By.id("inputUsername")).clear();
//	  
		String text = driver.findElement(By.cssSelector("a.w3-right")).getText();
		driver.findElement(By.cssSelector("a.w3-right")).click();
		System.out.println(text);
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		link text locators are used to identify text in inner html.for ex =(<a href = '#'>"forget your password?"</a>)

//	 
		driver.close();
		driver.quit();
	}
//	method-1 with selectorshub
//	when you want to find an element with xpath selector using index use this syntax Tagname[@attribute='value'][1]
//	in case of css selector use this syntax Tagname[attribute='value']:nth-child(1)
//	sometimes  for the same index 1, xpath selector will find one element and css selector will find one element because of some hidden attributes.Xpath selector sometimes will ignore that.
// xpath will ignore that hidden attribute but in css selector hidden attribute before the index 1 is also counted and finally index 2 is counted for name element [for reference see 37 th video at 8:53 seconds]
	
	
//	method 2- traversing from parent to child method with selectorshub
//	 for xpath- //parenttagname/childtagname -use this incase if you dont have any attributes and values or link ;
//	 for css selector - parenttagname childtagname- this is the syntax used if you dont have any attribute and values or link
	
//	method 3-checking with console without selectors hub
//	$x('input[@placeholder="Name"]')

//	method 4- using ctrl+F without selectorshub
//	.parentTagname.childTagname with space
//	                   or
//	if there are multiple classes under one class attribute ,to get particular classname use .classname.classname without space because they both are like siblings.
 
}
