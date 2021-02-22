import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SighUp {
    public static void main(String[] args) {
		
	     System.setProperty("webdriver.chrome.driver", "D:\\Programing Libraries\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.get("https://www.phptravels.net/register");
	     String webTitle = driver.getTitle();
	     System.out.println(webTitle);
	     String uRL = driver.getCurrentUrl();
	     System.out.println(uRL);
	     
	     driver.findElement(By.name("firstname")).sendKeys("Mike");
	     driver.findElement(By.name("lastname")).sendKeys("Thanos");
	     driver.findElement(By.name("phone")).sendKeys("2408762456");
	     driver.findElement(By.name("email")).sendKeys("IronManWin@gmail.com");
	     driver.findElement(By.name("password")).sendKeys("Mr007420");
         driver.findElement(By.name("confirmpassword")).sendKeys("Mr007420");
         
         WebElement readSignUp = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button"));
         String signUpString = readSignUp.getText();
         System.out.println(signUpString);
	
         driver.quit();
         }

}
