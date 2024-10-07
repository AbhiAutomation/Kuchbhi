package selenium;
import java.time.Duration;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;



public class RelativeLocatorTest {
	private WebDriver driver ;
	private WebDriverWait webDriverWait;
	
	@BeforeClass public void setupClass()
	{
		WebDriverManager.chromedriver().setup();
		System.out.println("Inside the setup classes ");
		
	}
	@BeforeMethod 
	public void setup()
	{
		driver = new ChromeDriver();
		//We set up an explicit wait with Duration.ofSeconds(30).
		webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
	}
	
	@Test
	public void zipCodeTest() 
	{
		System.out.println("Inside the zipcodeTest method ");
		driver.navigate().to("https://www.zip-codes.com/search.asp");
		WebElement advanceSearch = driver.findElement(By.xpath("//h3[text()='Advanced Search']"));
		advanceSearch.click();
	
		WebElement cityInput	= driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//label[text()='Town/City:']/following-sibling::input")));
		cityInput.sendKeys("Sofia");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
	

	@AfterClass
	public void tearDown()
	{
		System.out.println("Inside the teardown method ");
		driver.quit();
	}


}
