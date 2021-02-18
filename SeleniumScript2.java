import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript2 {

	public static void main(String[] args) throws InterruptedException {
		
		// Flicker Test Script only for testing skill purpose
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Software Testing\\\\Libraries\\\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.navigate().to("https://identity.flickr.com/sign-up");
			
			  
			 WebElement firstname = driver.findElement(By.id("sign-up-first-name"));
			 WebElement lastname = driver.findElement(By.id("sign-up-last-name"));
			 WebElement age = driver.findElement(By.id("sign-up-age"));
			 WebElement email = driver.findElement(By.id("sign-up-email"));
			 WebElement passward = driver.findElement(By.id("sign-up-password"));
			 WebElement singup = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/button"));
			 
			 
			 firstname.sendKeys("Michael");
			 lastname.sendKeys("John");
			 age.sendKeys("30");
			 email.sendKeys("mithkks@gmail.com");
			 passward.sendKeys("Mr00123@#$");
			 boolean SignupEnabled = singup.isEnabled();
			 if (SignupEnabled)
		     {System.out.println(SignupEnabled);}
			 String readSignup = singup.getText();
			 System.out.println(readSignup);
			 
			 Thread.sleep(2000);
			 driver.quit();
		
		}

}
