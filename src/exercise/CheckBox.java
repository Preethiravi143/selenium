package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		WebElement webElementForSelectBar = driver.findElement(By.id("dropdown-class-example"));
		webElementForSelectBar.click();
		Select option = new Select(webElementForSelectBar);
		option.selectByIndex(1);
		option.getFirstSelectedOption().getText();
		
		
	}

}
