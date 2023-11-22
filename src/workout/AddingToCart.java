package workout;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import exercise.Arrays;

public class AddingToCart {
	static String UserNameSelector = "input[id='username']";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		WebDriverWait explicitWait = new WebDriverWait(driver,DurationOfSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		By selectors = By.cssSelector(UserNameSelector);
		WebElement userNameWebElement = driver.findElement(selectors);
		userNameWebElement.click();
		userNameWebElement.sendKeys("rahulshettyacademy");
		WebElement passwordElement = driver.findElement(By.cssSelector("input[id='password']"));
		passwordElement.click();
		passwordElement.sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = 'Okay']")));
		driver.findElement(By.xpath("//button[text() = 'Okay']")).click();
		WebElement StaticDropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropDown = new Select(StaticDropDown);
		dropDown.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		AddingToCart.addToCart(driver);
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']")));
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.findElement(By.xpath("//input[@id='country']")).click();
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Vellakovil");
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='checkbox2']")));
		driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
		
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();
		driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();

	}

	

	private static Duration DurationOfSeconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}



	public static void addToCart(WebDriver driver) throws InterruptedException {

//List<WebElement> itemsAdded= driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for (int i = 0; i < driver.findElements(By.xpath("//button[contains(text(),'Add')]")).size(); i++) {
			driver.findElements(By.xpath("//button[contains(text(),'Add')]")).get(i).click();
		}

	}

}
