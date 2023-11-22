package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeListSelectionAndSelectClass {
	static String searchBar = "//input[@id='search']";
	static String expectedResult = "sony tv live";

	public static void main(String[] args) throws InterruptedException {
		
//		int expectedResultPosition = -1;

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");

		driver.findElement(By.xpath(searchBar)).click();
		driver.findElement(By.xpath(searchBar)).sendKeys("sonyt");
		driver.findElement(By.xpath(searchBar)).sendKeys("v");
		Thread.sleep(2000);
		List<WebElement> suggestionList = driver.findElements(By.xpath("//div[@class='sbse']/div[@class='sbqs_c']"));
		Thread.sleep(3000);
		int sizeOfSuggestionList = suggestionList.size();
		for (int i = 0; i < sizeOfSuggestionList; i++) {
//			if (expectedResult.equalsIgnoreCase(suggestionList.get(i).getText())) {
			if (suggestionList.get(i).getText().equalsIgnoreCase(expectedResult)) {
//				suggestionList.get(i).click();
				break;
				}
				suggestionList.get(i).click();
		}

//		Thread.sleep(3000);

		//
	}

}
