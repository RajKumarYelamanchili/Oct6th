package T1testng;

//Soft assertions allow all the assertions to be executed and 
//collect the results before marking the test as failed.
	
	import org.testng.Assert;
	import org.testng.asserts.SoftAssert;
	import org.testng.annotations.Test;

	public class SoftAssertEx {

	    @Test
	    public void testSoftAssert() {
	        SoftAssert softAssert = new SoftAssert();
	        
	        int actual = 10;
	        int expected = 15;
	        softAssert.assertEquals(actual, expected, "Values are not equal");

	        boolean condition = false;
	        softAssert.assertTrue(condition, "Condition is not true");

	       softAssert.assertAll(); // This is important to call to mark the test as passed or failed
	        System.out.println("This line will be executed regardless of assertion results.");
	    }
	}


