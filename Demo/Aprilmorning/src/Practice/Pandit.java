package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pandit {
 public WebDriver driver;
	@Beforesuit
  public void f() {
	  System.setProperty("webdriver.chrome.driver","E:/Selenium/chromedriver.exe");
		 driver=new ChromeDriver();
		
		 @BeforeTest
		    public void profileSetup()
		    {
		        driver.manage().window().maximize();
		        System.out.println("The chrome browser is maximize");
		        
		    }
		    
		    @BeforeClass
		    public void appSetup()
		    {
		        driver.get("https://www.naukri.com/");
		        System.out.println("Entered the endureka link");
		    }
		    
		    @BeforeMethod
		    public void checkLogin() throws InterruptedException
		    {
		    	driver.findElement(By.id("login_Layer")).click();
		    	driver.findElement(By.xpath("//input[@type='text']")).sendkeys("itsme@123gmpatil23")
		    	   driver.findElement(By.xpath("//input[@type='password']")).sendkeys("")
		    	   Thread.sleep(2000);
		           
		          driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		   
		    }
		    
		    @Test
		    public void clickOnMyProfile() throws InterruptedException
		    {
		        
		    	WebElement profile = driver.findElement(By.className("dropdown-toggle trackButton"));
		    	//("//span[@class='webinar-profile-name']"))
		    	Actions a = new Actions(driver);
		    	a.moveToElement(profile).build().perform();
		    	a.click();
		 
		
  
  
  }
}
