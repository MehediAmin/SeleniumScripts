import java.util.concurrent.TimeUnit;

import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript3 {

	public static void main(String[] args) {
		
//    MercuryTours Test Script only for testing skill purpose
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Libraries\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		 driver.get("http://newtours.demoaut.com/mercuryregister.php");
		 String webTitle = driver.getTitle();
		 System.out.println(webTitle);
		 String uRL = driver.getCurrentUrl();
		 System.out.println(uRL);
		 
		 driver.findElement(By.name("firstName")).sendKeys("Mike");
		 driver.findElement(By.name("lastName")).sendKeys("Thanos");
		 driver.findElement(By.name("phone")).sendKeys("2408762456");
		 driver.findElement(By.id("userName")).sendKeys("IronManWin@gmail.com");
		 driver.findElement(By.name("address1")).sendKeys("666 Thanos Home");
		 driver.findElement(By.name("address2")).sendKeys("Welcome");
		 driver.findElement(By.name("city")).sendKeys("Asgard");
		 driver.findElement(By.name("state")).sendKeys("Budapest");
		 driver.findElement(By.name("postalCode")).sendKeys("67007");
		 
         WebElement countryDropdown = driver.findElement(By.name("country"));
         Select country = new Select(countryDropdown);
         country.selectByVisibleText("UGANDA");
         
         driver.findElement(By.id("email")).sendKeys("IronManWin");
         driver.findElement(By.name("password")).sendKeys("Mr007420");
         driver.findElement(By.name("confirmPassword")).sendKeys("Mr007420");
         
         WebElement submit = driver.findElement(By.name("register"));
	     boolean ifSubmitDisplayed = submit.isDisplayed();
	     if (ifSubmitDisplayed);
	     {System.out.println(ifSubmitDisplayed);}
	     
	     WebElement submitClick = driver.findElement(By.name("register"));
	     boolean ifSubmitClickable = submitClick.isEnabled();
	     if (ifSubmitClickable);
	     {System.out.println(ifSubmitClickable);}
	     
	     Thread.sleep(2000);
	     driver.quit();
	     }

}
