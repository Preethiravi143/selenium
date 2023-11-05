package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxCount {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_css_custom_checkbox.asp");
		Thread.sleep(2000);
		String locator ="//strong[text()='Default:']/parent::p/following-sibling::input[@type='checkbox']";
		By element = By.xpath(locator);
		List<WebElement> elements = driver.findElements(element);
		int num = elements.size();
		System.out.println(num);
		
	}

}
