package testNgImeline;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test
	public void demo1()
	{	
		System.out.println("demo1");
	}
	@Test(invocationCount = 2)
	public void demo2()
	{	
		System.out.println("demo2");
	}
	@Test(invocationCount = 4)
	public void demo3()
	{	
		System.out.println("demo3");
	}
	@Test
	public void demo4()
	{	
		System.out.println("demo4");
	}
	@Test(invocationCount = 3)
	public void demo5()
	{	
		System.out.println("demo5");
	}
}
