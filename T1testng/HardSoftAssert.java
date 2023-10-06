package T1testng;


	
	import java.sql.Driver;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class HardSoftAssert {
	
			@Test
			public void googleTest() throws InterruptedException 
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver1\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.get("http://www.google.com");
				Thread.sleep(2000);
				
				
						
				String ExpectedTitle="Google1";
				String ActualTitle= driver.getTitle();
				System.out.println(ActualTitle);
				
				Assert.assertEquals(ActualTitle, ExpectedTitle,"Title is not matching");
					
				System.out.println("this will not execute");
				driver.quit();
					
				
			}
		
	/*	@Test
		public void googleTest1() throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
			
			driver.manage().window().maximize();
			Thread.sleep(1000);
					
			String ExpectedTitle="Google1";
			String ActualTitle= driver.getTitle();
			
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(ActualTitle,ExpectedTitle,"Title is not matching");
			
			
			System.out.println("this will  execute");
			driver.quit();
			soft.assertAll();*/

		}
	
	
	


