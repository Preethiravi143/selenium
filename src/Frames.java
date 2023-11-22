import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		driver.findElement(By.cssSelector("frameset[frameborder='1']"));
//		WebDriver outerFrame = driver.switchTo().frame(driver.findElement(By.cssSelector("frameset[frameborder='1']")));
		WebDriver innerFrame1 = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
//		WebDriver innerFrame2 = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-bottom']")));
//		WebDriver innerFrames = 
		
		WebDriver left = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-left']")));
//		WebDriver middle = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
//		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-bottom']")));
		System.out.println(driver.findElement(By.id("content")).getText());
//		WebDriver right = driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-right']")));
//		WebDriver[] innerFrame11 = {left,middle,right};
//		WebDriver[] innerFrame22 = {bottom};
//		WebDriver[][] innerFrames = {innerFrame11 , innerFrame22};
//		WebDriver[] innerFrame1  = {left,middle,right};
//		WebDriver[] innerFrame2 = {bottom};
//		for(WebDriver[] innerFramesLooped : innerFrames) {
//			for(WebDriver innermostFrame:  innerFramesLooped) {
//				if(innermostFrame == middle){
//					System.out.println("middle");
//					break;
//				}
//				
//			}
//		}
	}

}
