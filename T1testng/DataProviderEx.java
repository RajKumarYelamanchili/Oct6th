package T1testng;


	import org.testng.Assert;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class DataProviderEx {

	    @DataProvider(name = "data-provider")
	    public Object[][] dataProviderMethod() {
	        return new Object[][] { { 2, 4 }, { 3, 9 }, { 4, 16 } };
	    }

	    @Test(dataProvider = "data-provider")
	    public void testSquare(int num, int square) {
	        int result = num * num;
	        Assert.assertEquals(result, square, "Square calculation failed");
	    }
	}


