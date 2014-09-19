package git.com;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgendaChecker {
	private List<Period> periods;
	
	public AgendaChecker(String[][] startEndPairs) throws ParseException {
		createPeriods(startEndPairs);
	}
	
	private void createPeriods(String[][] input) throws ParseException {
		periods = new ArrayList<Period>();
		for (String[] dates : input) {
			Period period = new Period(
				Utility.parseDate(dates[0]),
				Utility.parseDate(dates[1])
			);
			periods.add(period);
		}
	}
	
	public boolean isTheInputInGivenPeriods(String inputDate) throws ParseException {
		Date date = Utility.parseDate( inputDate );
		for (Period period : periods) {
			if ( period.isWithinRange(date) ) {
				return true;
			}
		}
		return false;
	}
}
