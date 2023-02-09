package genericLibraries;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
@BeforeSuite
public void BeforeSuite() {
	System.out.println("beforesuite");
}
@BeforeTest
public void BeforeTest() {
	System.out.println("beforetest");
}

@BeforeClass
public void BeforeClass() {
	System.out.println("beforeclass");
}

@BeforeMethod
public void BeforeMethod() {
	System.out.println("beforemethod");
}


@AfterMethod
public void AfterMethod() {
	System.out.println("aftermethod");
}

@AfterClass
public void AfterClass() {
	System.out.println("afterclass");
}

@AfterTest
public void AfterTest() {
	System.out.println("aftertest");
}
@AfterSuite
public void AfterSuite() {
	System.out.println("aftersuite");
}

}
