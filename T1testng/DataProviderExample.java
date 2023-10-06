package T1testng;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	public class DataProviderExample {

		@Test(dataProvider= "testdata1")
	public void dataDrivenTest(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		 Thread.sleep(2000);
		 
		driver.close();
	}

	@DataProvider(name="testdata1")
	public  Object[][]   testdataFacebook()
	{
		
		Object[][]  fbdata= new Object[4][2];
		
		fbdata[0][0] = "username1";
		fbdata[0][1] = "password1";
		
		fbdata[1][0] = "username2";
		fbdata[1][1] = "password2";
		
		fbdata[2][0] = "username3";
		fbdata[2][1] = "password3";
		
		fbdata[3][0] = "username4";
		fbdata[3][1] = "password4";
		
		return fbdata;
		
	}


	}


