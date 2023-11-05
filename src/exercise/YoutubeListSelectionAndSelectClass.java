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
		
		int expectedResultPosition = -1;

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");

		driver.findElement(By.xpath(searchBar)).click();
		driver.findElement(By.xpath(searchBar)).sendKeys("sonyt");
		driver.findElement(By.xpath(searchBar)).sendKeys("v");
		Thread.sleep(2000);
		List<WebElement> suggestionList = driver.findElements(By.xpath("//div[@class='sbse']/div[@class='sbqs_c']"));
		Thread.sleep(3000);
		System.out.println("suggestion size:" + suggestionList.size());
//		System.out.println(suggestionList);
		int sizeOfSuggestionList = suggestionList.size();
		for (int i = 0; i < sizeOfSuggestionList; i++) {
			System.out.println("i=" + suggestionList.get(i).getText());
			if (expectedResult.equalsIgnoreCase(suggestionList.get(i).getText())) {
				System.out.println("insideif");
				expectedResultPosition = i+1;
				suggestionList.get(i).click();
				break;
				
			}

		}

//		Thread.sleep(3000);

		//
	}

}
