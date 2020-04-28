package test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.Test;

class TestHotel {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		String path = "/Users/myoungkyu/Desktop/selenium/chrome-driver-2.43/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		baseUrl = "https://www.unomaha.edu/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testLogin() throws Exception {
		driver.get("http://ec2-3-19-63-152.us-east-2.compute.amazonaws.com:8080/project-fakehotel/HotelServlet");
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("bpinkel");
		
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.id("SignIn")).click();
		Thread.sleep(3000);
		
		String expected = "HotelServlet";
		String result = driver.findElement(By.xpath("//*[@id=\"main\"]")).getAttribute("action");
		Assert.assertEquals(expected, result);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}



}
