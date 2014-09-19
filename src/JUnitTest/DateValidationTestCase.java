package JUnitTest;
/*
 * @author Sailaja Yelloze 
 * 
 * 
 */

import git.com.AgendaChecker;
import junit.framework.TestCase;


public class DateValidationTestCase extends TestCase {
	String[][] dateRanges = { { "2014/01/01", "2015/01/01" },
			{ "2015/02/02", "2016/01/01" }, { "2016/02/02", "2017/01/01" } };
	AgendaChecker agendaChecker = new AgendaChecker();

	//static String[]  dateTobeChecked;

	public DateValidationTestCase(String testName) {
		super(testName);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		
		agendaChecker.createPeriods(dateRanges);	
	
	}

	protected void tearDown() throws Exception {
		
		super.tearDown();
		
		
	}

	public void testDatesBetweenRange() {
		String[]  dateTobeChecked={"2014/05/05","2013/01/01","2012/01/01","2016/05/05","2015/01/01","2015/01/02"};
		try{
			for(int i=0;i<=dateTobeChecked.length;i++){
				System.out.println(dateTobeChecked[i] +" :"+"   \tIs Date within Range ? : "
						+ agendaChecker
								.isTheInputInGivenPeriods(dateTobeChecked[i]));
				
			}
			}catch(Exception e){}
	}

	
}
