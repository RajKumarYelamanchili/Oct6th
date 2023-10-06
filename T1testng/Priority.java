package T1testng;

import org.testng.annotations.Test;

public class Priority {
	
		@Test(priority=3)
		public void c_method()
		{
			System.out.println("I am from c method");
		}
		@Test(priority=2)
		public void b_method()
		{
			System.out.println("I am from b method");
		}
		@Test(priority=1)
		public void a_method()
		{
			System.out.println("I am from a method");
		}
		@Test(priority=5)
		public void e_method()
		{
			System.out.println("I am from e method");
		}
		@Test(priority=4)
		public void d_method()
		{
			System.out.println("I am from d method");
		}
}
