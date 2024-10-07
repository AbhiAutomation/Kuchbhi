package selenium;


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// only access the method on  WebDriver and SeachContext  
		WebDriver  driver = new ChromeDriver();
		
		
		// driver 1 you can access all hearchy 
		ChromeDriver driver1 = new ChromeDriver();
		
		
		//driver2  using for SeleniumGrid in Docker  
		
		//WebDriver driver2 = new RemoteWebDriver(RemoteAdress , Capabilities);
		
		///
		
		
		
	 

	}

}
