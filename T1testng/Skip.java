package T1testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip {
	@Test
    public void test1() {
        System.out.println("This is Test 1");
    }
    
    @Test
    public void test2() {
        // Skipping this test programmatically
        System.out.println("This is Test 2, but it will be skipped.");
        throw new SkipException("Skipping Test 2");
    }
    
    @Test(enabled = false)
    public void test3() {
        // This test is disabled and won't run
        System.out.println("This is Test 3, but it is disabled.");
    }

}
