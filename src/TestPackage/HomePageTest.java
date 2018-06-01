package TestPackage;

import org.testng.annotations.Test;

import PagesPackage.HomePage;
import PagesPackage.BasePage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	
	
  @Test
  public void f() {
	  
	  homePage.openHomePage();
	  
	  homePage.clickNBAPlayoffsButton();
  }
  @BeforeMethod
  public void beforeTest() {
	  
		homePage = new HomePage(driver, wait);

	  
  }

  @AfterMethod
  public void afterTest() {
	  
  }

}
