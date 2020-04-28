package edu.uno.tests.case3;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLogout {
   private WebDriver driver;
   private String baseUrl;
   private boolean acceptNextAlert = true;
   private StringBuffer verificationErrors = new StringBuffer();

   @Before
   public void setUp() throws Exception {
      System.setProperty("webdriver.chrome.driver", "lib/mac/chromedriver");
      driver = new ChromeDriver();
      baseUrl = "https://www.katalon.com/";
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }

   public void doLogin() throws Exception {
      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
      driver.findElement(By.id("txtUsername")).click();
      driver.findElement(By.id("txtUsername")).clear();
      driver.findElement(By.id("txtUsername")).sendKeys("Admin");
      driver.findElement(By.id("txtPassword")).clear();
      driver.findElement(By.id("txtPassword")).sendKeys("admin123");
      driver.findElement(By.id("btnLogin")).click();
   }

   @Test
   public void testLogout() throws Exception {
      doLogin();

      driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
      driver.findElement(By.id("welcome")).click();
      Thread.sleep(2000);
      driver.findElement(By.linkText("Logout")).click();
      Thread.sleep(2000);

      String expected = "";
      WebElement findElement = driver.findElement(By.xpath("//div[@id='divUsername']/input[1]"));
      String result = findElement.getText();
      Assert.assertEquals(expected, result);
      Thread.sleep(2000);
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
