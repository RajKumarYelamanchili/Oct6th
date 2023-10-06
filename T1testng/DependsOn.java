package T1testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
		
		@Test(dependsOnMethods= {"verifyLogin"})
		public void verifyPayment()
		{
			System.out.println("Payment");
		}
		@Test
		public void verifyLogin()
		{
		    Assert.assertTrue(true);
			System.out.println("Login");
		}
	}


