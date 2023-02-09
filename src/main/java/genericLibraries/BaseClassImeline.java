package genericLibraries;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClassImeline {
	protected ExcelUtility excel;
	protected PropertiesFileUtility property;
	protected JavaUtility javaUtil;
	protected WebDriverUtility web;

	// @BeforeSuite

	// @BeforeTest

	@BeforeClass
	public void ClassSetup() {
		property = new PropertiesFileUtility();
		excel = new ExcelUtility();
		javaUtil = new JavaUtility();
		web = new WebDriverUtility();

		property.propertyFileInitialization(IConstantPath.PROPERTY_FILE_PATH);
		excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
	}

	@BeforeMethod
	public void methodSetup() {
		
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("aftermethod");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("afterclass");
	}

	// @AfterTest

	// @AfterSuite
}