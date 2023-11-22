import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class ParentAndChildWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.get("http://localhost:4200/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		ParentAndChildWindowHandles.movingtoNewWindow(driver);
		ParentAndChildWindowHandles.movingtoNewWindow(driver);
		ParentAndChildWindowHandles.movingtoNewWindow(driver);
		ParentAndChildWindowHandles.movingtoNewWindow(driver);
		driver.switchTo().window(printValue(driver, 4));
	}
	
	static String printValue(WebDriver driver, int position) {
		Set<String> window = driver.getWindowHandles();
		Iterator<String> loopit = window.iterator();
		String lastId = loopit.next();
		int loopCount = 1;
		while(loopit.hasNext()) {
			if(position == loopCount) {
				System.out.println("inside break");
				break;
			}
			loopCount++;
			
			lastId = loopit.next();
		}
		
		return lastId;
	}
	
	static String getParentHandlerText(WebDriver driver) {
		Set<String> window = driver.getWindowHandles();
		System.out.println(window);
		Iterator<String> loopit = window.iterator();
		return loopit.next();
	}
	
	static void movingtoNewWindow(WebDriver driver) throws InterruptedException {
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Thread.sleep(5000);
		String lastChildId = printValue(driver, 10000);
		driver.switchTo().window(lastChildId);
		String newWindowText = driver.findElement(By.cssSelector("h3")).getText();
		System.out.println(newWindowText);
		driver.switchTo().window(getParentHandlerText(driver));
	}
	
}
