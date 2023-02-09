package xmlParameterization;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class PracticeTest {

	@Test
	public void demo(XmlTest xml){
		System.out.println("In demoTest");
		
		//step2: convert class into .xml file
		//right click on class file
		//go to testng
		//then click on convert to testng

		///////////////////test ng plugin installation/////////////////////////
		//help-eclipse market place-search for testng
		//install the testng for eclipse plugin
		//restart the eclipse
		
		System.out.println(xml.getParameter("url"));
		System.out.println(xml.getParameter("username"));
		System.out.println(xml.getParameter("password"));
		
		
		
		
		
		
	}

}
