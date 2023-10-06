package T1testng;




	import org.testng.annotations.Test;

	public class Group {
		@Test(groups= {"Login","Smoke","High"})
		public void test1()
		{
			System.out.println("TC1 Login,Smoke, High");
		}
		@Test(groups= {"Login","Regression","High"})
		public void test2()
		{
			System.out.println("TC2 Login,Regression, High");
		}
		@Test(groups= {"Search","Smoke","Medium"})
		public void test3()
		{
			System.out.println("TC3 Search,Smoke, Medium");
		}
		@Test(groups= {"Search","Regression","Medium"})
		public void test4()
		{
			System.out.println("TC4 Search,Regression, Medium");
		}
		@Test(groups= {"AddToCart","Regression"})
		public void test5()
		{
			System.out.println("TC5 AddToCart,Regression");
		}
		@Test(groups= {"AddToCart","Medium"})
		public void test6()
		{
			System.out.println("TC6 AddToCart,Medium");
		}
		@Test(groups= {"Payment","Smoke","Regression","Medium"})
		public void test7()
		{
			System.out.println("TC7 Payment,Smoke,Regression,Medium");
		}
		@Test(groups= {"Payment","Regression"})
		public void test8()
		{
			System.out.println("TC8 Payment,Regression");
		}
		@Test(groups= {"Download","Low"})
		public void test9()
		{
			System.out.println("TC9 Download,Low");
		}
		@Test(groups= {"Download","Low","Regression"})
		public void test10()
		{
			System.out.println("TC10 Download,Low,Regression");
		}

	}


