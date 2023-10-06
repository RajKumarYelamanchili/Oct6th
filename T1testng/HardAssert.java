package T1testng;


	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class HardAssert {

	    @Test
	    public void testHardAssert() {
	        int actual = 10;
	        int expected = 15;
	        Assert.assertEquals(actual, expected, "Values are not equal");
	        System.out.println("This line will be executed only if the assertion passes.");
	    }
	}


