package work;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPF {

	public static void main(String[] args) throws IOException {

		//step1:convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/commonData.properties");
		
		//step2:Create an instance for properties class
	    //properties class is available in java.util package
		Properties p=new Properties();
		
		//step3:Load all the key-value pairs to properties object
		p.load(fis); //IOException
		//java concept involved is Map interface-HashTable
		
		//step4:Read data
		String url=p.getProperty("url");
		long time=Long.parseLong(p.getProperty("timeouts"));
		
		System.out.println(url+"\t"+time);
		
	}
	

}
