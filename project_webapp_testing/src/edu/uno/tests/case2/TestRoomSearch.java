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

public class TestRoomSearch {
   private WebDriver driver;
   private String baseUrl;
   private boolean acceptNextAlert = true;
   private StringBuffer verificationErrors = new StringBuffer();

   @Before
   public void setUp() throws Exception {
      System.setProperty("webdriver.chrome.driver", //
    		  "lib\\win\\chromedriver.exe");
      driver = new ChromeDriver();
      // driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }

   @Test
   public void testClassSearch2Guests() throws Exception {
      driver.get("http://ec2-3-19-63-152.us-east-2.compute.amazonaws.com:8080/fakehotel/hotel-mockup.html");
      Thread.sleep(500);
      driver.findElement(By.id("check_in")).click();
      Thread.sleep(500);
      driver.findElement(By.id("check_in")).sendKeys("05/01/2020");
      Thread.sleep(500);
      driver.findElement(By.id("check_out")).click();
      Thread.sleep(500);
      driver.findElement(By.id("check_out")).sendKeys("05/04/2020");
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"prices\"]/option[2]")).click();
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"guestnum\"]/option[2]")).click();
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"main\"]/main/div/div/input[1]")).click();
      
      String expected = "Room Number: 2   Floor: 2   Number of Beds: 2   Check Out: 05/04/2020   BOOK ROOM";
		String result = driver.findElement(By.xpath("//*[@id=\"rooms_form\"]/main/div[1]/div[2]/div/div/div/h1")).getText();
		//String result = driver.findElement(By.xpath("//*[@id=\"main\"]")).getAttribute("action");
		Assert.assertEquals(expected, result);
   }
   
   @Test
   public void testClassSearch3Guests() throws Exception {
      driver.get("http://ec2-3-19-63-152.us-east-2.compute.amazonaws.com:8080/fakehotel/hotel-mockup.html");
      Thread.sleep(500);
      driver.findElement(By.id("check_in")).click();
      Thread.sleep(500);
      driver.findElement(By.id("check_in")).sendKeys("05/01/2020");
      Thread.sleep(500);
      driver.findElement(By.id("check_out")).click();
      Thread.sleep(500);
      driver.findElement(By.id("check_out")).sendKeys("05/04/2020");
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"prices\"]/option[3]")).click();
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"guestnum\"]/option[3]")).click();
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"main\"]/main/div/div/input[1]")).click();
      
      String expected = "Room Number: 19   Floor: 4   Number of Beds: 3   Check Out: 05/04/2020   BOOK ROOM";
		String result = driver.findElement(By.xpath("//*[@id=\"rooms_form\"]/main/div[5]/div[2]/div/div/div/h1")).getText();
		//String result = driver.findElement(By.xpath("//*[@id=\"main\"]")).getAttribute("action");
		Assert.assertEquals(expected, result);
   }
   
   @Test
   public void testClassSearch4Guests() throws Exception {
      driver.get("http://ec2-3-19-63-152.us-east-2.compute.amazonaws.com:8080/fakehotel/hotel-mockup.html");
      Thread.sleep(500);
      driver.findElement(By.id("check_in")).click();
      Thread.sleep(500);
      driver.findElement(By.id("check_in")).sendKeys("05/01/2020");
      Thread.sleep(500);
      driver.findElement(By.id("check_out")).click();
      Thread.sleep(500);
      driver.findElement(By.id("check_out")).sendKeys("05/04/2020");
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"prices\"]/option[4]")).click();
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"guestnum\"]/option[4]")).click();
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"main\"]/main/div/div/input[1]")).click();
      
      String expected = "Room Number: 22   Floor: 3   Number of Beds: 2   Check Out: 05/04/2020   BOOK ROOM";
		String result = driver.findElement(By.xpath("//*[@id=\"rooms_form\"]/main/div[3]/div[2]/div/div/div/h1")).getText();
		//String result = driver.findElement(By.xpath("//*[@id=\"main\"]")).getAttribute("action");
		Assert.assertEquals(expected, result);
   }
   
   @Test
   public void testClassSearch5Guests() throws Exception {
      driver.get("http://ec2-3-19-63-152.us-east-2.compute.amazonaws.com:8080/fakehotel/hotel-mockup.html");
      Thread.sleep(500);
      driver.findElement(By.id("check_in")).click();
      Thread.sleep(500);
      driver.findElement(By.id("check_in")).sendKeys("05/01/2020");
      Thread.sleep(500);
      driver.findElement(By.id("check_out")).click();
      Thread.sleep(500);
      driver.findElement(By.id("check_out")).sendKeys("05/04/2020");
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"prices\"]/option[5]")).click();
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"guestnum\"]/option[5]")).click();
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"main\"]/main/div/div/input[1]")).click();
      
      String expected = "Room Number: 11   Floor: 4   Number of Beds: 3   Check Out: 05/04/2020   BOOK ROOM";
		String result = driver.findElement(By.xpath("//*[@id=\"rooms_form\"]/main/div[2]/div[2]/div/div/div/h1")).getText();
		//String result = driver.findElement(By.xpath("//*[@id=\"main\"]")).getAttribute("action");
		Assert.assertEquals(expected, result);
   }
   @Test
   public void testRoomSearch() throws Exception {
      driver.get("http://ec2-3-19-63-152.us-east-2.compute.amazonaws.com:8080/fakehotel/hotel-mockup.html");
      Thread.sleep(500);
      driver.findElement(By.id("check_in")).click();
      Thread.sleep(500);
      driver.findElement(By.id("check_in")).sendKeys("05/01/2020");
      Thread.sleep(500);
      driver.findElement(By.id("check_out")).click();
      Thread.sleep(500);
      driver.findElement(By.id("check_out")).sendKeys("05/04/2020");
      Thread.sleep(500);
      driver.findElement(By.xpath("//*[@id=\"main\"]/main/div/div/input[1]")).click();
      
      String expected = "Room Number: 1   Floor: 1   Number of Beds: 1   Check Out: 05/04/2020   BOOK ROOM";
		String result = driver.findElement(By.xpath("//*[@id=\"rooms_form\"]/main/div[1]/div[2]/div/div/div/h1")).getText();
		//String result = driver.findElement(By.xpath("//*[@id=\"main\"]")).getAttribute("action");
		Assert.assertEquals(expected, result);
      /*
      new Select(driver.findElement(By.id("subject"))).selectByVisibleText("Computer Science");
      Thread.sleep(1000);
      driver.findElement(By.name("weekdays[]")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("(//input[@name='weekdays[]'])[3]")).click();
      Thread.sleep(1000);
      driver.findElement(By.id("class-search-submit")).click();
      Thread.sleep(3000);
      */
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
