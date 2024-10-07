package selenium;

import org.testng.annotations.*;

@Test(groups = "smoke")
public class ConfigurationAnnotation_2_ListBox {

	
	public void test1() {
		System.out.println("         ==>TestMethod 1 ListBox ");

	}

	
	public void test2() {
		System.out.println("         ==>TestMethod 2 ListBox ");

	}

	
	public void test3() {
		System.out.println("          ==>TestMethod 3 ListBox ");

	}

	@BeforeMethod
	public void befoeMethod() {
		System.out.println("     (2) Execute befire each method  ListBox");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("     (2) Execute after  each method ListBox ");
	}
	
	@BeforeClass 
	public void beforClasss()
	{
		System.out.println("   (3) Execute Before Class ListBox ");
	
	}

	@AfterClass 
	public void afterClasss()
	{
		System.out.println("   (3) Execute after Class ListBox ");
	
	}
	
	@BeforeTest 
	public void beforTest()
	{
		System.out.println("   (7) Execute before each test ListBox ");
		
	}
	
	@AfterTest 
	public void afterTest()
	{
		System.out.println("   (7) Execute after each test ListBox ");
		
	}
	
	@BeforeSuite 
	public void beforeSuite()
	{
		System.out.println(" (9) Execute before the suite ListBox ");
		
	}
	@AfterSuite 
	public void afterSuite()
	{
		System.out.println(" (9) Execute after  the suite ListBox ");
		
	}
	
	@BeforeGroups(groups= {"regression","smoke"})
	public void beforeGroups()
	{
		System.out.println("(0) Execute before group ListBox ");
		
	}
	
	@AfterGroups(groups= {"regression","smoke"})
	public void afterGroups()
	{
		System.out.println("(0) Execute after  group ListBox ");
		
	}
	
}
