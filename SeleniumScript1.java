import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumScript1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Amazon Test Script only for testing skill purpose
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Libraries\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.amazon.com/");
			
			Thread.sleep(2000);
			WebElement todaysDeal = driver.findElement(By.linkText("Today's Deals"));
			String readTodaysDeal = todaysDeal.getText();
			System.out.println(readTodaysDeal);
			Thread.sleep(2000);
			todaysDeal.click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(1000);
			WebElement language = driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[1]/span[2]"));
			String readLanguage = language.getText();
			System.out.println(readLanguage);
			Thread.sleep(1000);
			language.click();
			
			Thread.sleep(1000);
			WebElement saveChange = driver.findElement(By.xpath("//*[@id=\"icp-btn-save\"]/span/input"));
			boolean ifSaveChangeEnabled = saveChange.isEnabled();
			if (ifSaveChangeEnabled)
			{System.out.println(ifSaveChangeEnabled);}
			Thread.sleep(2000);
			saveChange.click();
			
			WebElement bestSellers = driver.findElement(By.linkText("Best Sellers"));
			String readBestSeller = bestSellers.getText();
			System.out.println(readBestSeller);
			bestSellers.click();
			
			Thread.sleep(2000);
		    driver.quit();	

		}

}
