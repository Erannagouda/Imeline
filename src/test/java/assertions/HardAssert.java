package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void demo() {
		String s1 = "hi";
		String s2 = "hello";

		Assert.assertEquals(s1, s2);

		System.out.println(s1);
		System.out.println(s2);

	}

	@Test
	public void demo2() {
		System.out.println("in demo2");
	}
}