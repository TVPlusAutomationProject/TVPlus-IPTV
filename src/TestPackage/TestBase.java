package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public abstract class TestBase {
	
	WebDriver driver;
	WebDriverWait wait;
	
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\o00415773\\eclipse-workspace\\TV+ Automation\\libs\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
  }

  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  //driver.quit();
  }

}
