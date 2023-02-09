package groupexecution;

import org.testng.annotations.Test;

public class ThirdTest {
	public class FirstTest {
		@Test(groups="Regression")
			public void test0() {
				System.out.println("test0");
			}
			
		@Test(groups="sanity")
		public void test1() {
			System.out.println("test1");
		}
			
			
		@Test(groups={"Regression","sanity"})
		public void test2() {
			System.out.println("test2");
		}
	}
}
