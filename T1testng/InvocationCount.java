package T1testng;
	
	import org.testng.annotations.Test;

	public class InvocationCount {

	    @Test(invocationCount = 5)
	    public void testMethod() {
	        System.out.println("This test method will be invoked 5 times.");
	    }
	}


