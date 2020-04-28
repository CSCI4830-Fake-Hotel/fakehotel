package edu.uno.tests.case2;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClassSearch {
   private WebDriver driver;
   private String baseUrl;
   private boolean acceptNextAlert = true;
   private StringBuffer verificationErrors = new StringBuffer();

   @Before
   public void setUp() throws Exception {
      System.setProperty("webdriver.chrome.driver", "lib/mac/chromedriver");
      driver = new ChromeDriver(); // FirefoxDriver();
      baseUrl = "https://www.google.com/";
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }

   @Test
   public void testClassSearch() throws Exception {
      driver.get("https://www.unomaha.edu/index.php");
      Thread.sleep(1000);
      driver.findElement(By.id("Academics")).click();
      Thread.sleep(1000);
      driver.findElement(By.linkText("Class Search")).click();
      Thread.sleep(1000);
      driver.findElement(By.id("subject")).click();
      Thread.sleep(1000);
      new Select(driver.findElement(By.id("subject"))).selectByVisibleText("Computer Science");
      Thread.sleep(1000);
      driver.findElement(By.name("weekdays[]")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("(//input[@name='weekdays[]'])[3]")).click();
      Thread.sleep(1000);
      driver.findElement(By.id("class-search-submit")).click();
      Thread.sleep(3000);
   }

   @After
   public void tearDown() throws Exception {
      driver.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
         fail(verificationErrorString);
      }
   }

   private boolean isElementPresent(By by) {
      try {
         driver.findElement(by);
         return true;
      } catch (NoSuchElementException e) {
         return false;
      }
   }

   private boolean isAlertPresent() {
      try {
         driver.switchTo().alert();
         return true;
      } catch (NoAlertPresentException e) {
         return false;
      }
   }

   private String closeAlertAndGetItsText() {
      try {
         Alert alert = driver.switchTo().alert();
         String alertText = alert.getText();
         if (acceptNextAlert) {
            alert.accept();
         } else {
            alert.dismiss();
         }
         return alertText;
      } finally {
         acceptNextAlert = true;
      }
   }
}
