package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeTest {

	@Test(dataProvider = "dataForTicketBooking")
	public void bookTicketTest(String dest, String source) {
		System.out.println("From: "+source+"\t"+"To:"+dest);
	}
	
	@DataProvider
	public Object[][] dataForTicketBooking(){
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="Kalaburagi";
		obj[0][1]="Bangalore";
		
		obj[1][0]="Kalaburagi";
		obj[1][1]="Hyderabad";
		
		obj[2][0]="Kalaburagi";
		obj[2][1]="Dharwad";
		
		return obj;
		
	}
}
