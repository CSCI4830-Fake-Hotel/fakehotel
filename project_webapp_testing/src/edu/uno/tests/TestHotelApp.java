package edu.uno.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestHotelApp {
   private WebDriver driver;
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
   public void testViewMap() throws Exception {
	   driver.get("http://ec2-3-19-63-152.us-east-2.compute.amazonaws.com:8080/fakehotel/HotelServlet");
		
	   driver.findElement(By.id("mapButton")).click();
	   
	   Thread.sleep(2000);
	   
		String expected = "img";
		String result = driver.findElement(By.xpath("//*[@id=\"mapModal\"]/div/img")).getTagName();
		//String result = driver.findElement(By.xpath("//*[@id=\"main\"]")).getAttribute("action");
		Assert.assertEquals(expected, result);
   }
   
   @Test
   public void testBallRoomImages() throws Exception {
	   driver.get("http://ec2-3-19-63-152.us-east-2.compute.amazonaws.com:8080/fakehotel/HotelServlet");
		
	   driver.findElement(By.xpath("//*[@id=\"background\"]/header/button[3]")).click();
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("ballroomButton")).click();
	   Thread.sleep(500);
	   driver.findElement(By.id("ballroomA")).getTagName();
		String expected = "img";
		String result = driver.findElement(By.id("ballroomA"
				+ "")).getTagName();
		//String result = driver.findElement(By.xpath("//*[@id=\"main\"]")).getAttribute("action");
		Assert.assertEquals(expected, result);
   }

   @Test
   public void testConfRoomImage() throws Exception {
	   driver.get("http://ec2-3-19-63-152.us-east-2.compute.amazonaws.com:8080/fakehotel/HotelServlet");
		
	   driver.findElement(By.xpath("//*[@id=\"background\"]/header/button[3]")).click();
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("conferenceButton")).click();
	   Thread.sleep(500);
	   driver.findElement(By.id("conference")).getTagName();
		String expected = "img";
		String result = driver.findElement(By.id("conference")).getTagName();
		//String result = driver.findElement(By.xpath("//*[@id=\"main\"]")).getAttribute("action");
		Assert.assertEquals(expected, result);
   }
   
   @Test
   public void testViewEvents() throws Exception {
	   driver.get("http://ec2-3-19-63-152.us-east-2.compute.amazonaws.com:8080/fakehotel/HotelServlet");
		
	   driver.findElement(By.xpath("//*[@id=\"background\"]/header/button[3]")).click();
	   
	   Thread.sleep(2000);
	   
	   	
		
		String expected = "25th Annual Changes in Financial Analyzation Methods Conference";
		String result = driver.findElement(By.xpath("//*[@id=\"events_form\"]/main/div[2]/div[2]/div/div/div/h1")).getText();
		//String result = driver.findElement(By.xpath("//*[@id=\"main\"]")).getAttribute("action");
		Assert.assertEquals(expected, result);
   }
   
		
		
   @Test
   public void testLogin() throws Exception {
	   driver.get("http://ec2-3-19-63-152.us-east-2.compute.amazonaws.com:8080/fakehotel/HotelServlet");
		
	   driver.findElement(By.xpath("//*[@id=\"background\"]/header/button[2]")).click();
	   
	   Thread.sleep(2000);
	   
	   	driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("bpinkel");
		
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(3000);
		
		String expected = "Search Rooms:";
		String result = driver.findElement(By.xpath("//*[@id=\"main\"]/main/div/div/p")).getText();
		//String result = driver.findElement(By.xpath("//*[@id=\"main\"]")).getAttribute("action");
		Assert.assertEquals(expected, result);
	   /*
      driver.get("https://www.unomaha.edu/registrar/students/before-you-enroll/class-search/index.php");
      driver.findElement(By.id("subject")).click();
      Thread.sleep(200);
      new Select(driver.findElement(By.id("subject"))).selectByVisibleText("Computer Science");
      Thread.sleep(200);
      driver.findElement(By.name("weekdays[]")).click();
      Thread.sleep(200);
      driver.findElement(By.id("class-search-submit")).click();
      Thread.sleep(200);

      String expected = "CSCI 1200";
      String result = driver.findElement(By.xpath("//*[@class=\"dotted-bottom\"]/h2")).getAttribute("innerHTML");
      Assert.assertEquals(expected, result);
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
