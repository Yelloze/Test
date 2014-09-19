package git.com;



import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sailaja Yelloze
 *
 */
public class AgendaChecker {

	private List<Period> periods;

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String[][] dateRanges = { { "2014/01/01", "2015/01/01" },
				{ "2015/02/02", "2016/01/01" }, { "2016/02/02", "2017/01/01" } };

		AgendaChecker agendaChecker = new AgendaChecker();
		agendaChecker.createPeriods(dateRanges);
		//String dateTobeChecked = null;
		String[]  dateTobeChecked={"2014/05/05","2013/01/01","2012/01/01","2016/05/05","2015/01/01","2015/01/02"};
		try{
		for(int i=0;i<=dateTobeChecked.length;i++){
			System.out.println(dateTobeChecked[i] +" :"+"   \tIs Date within Range ? : "
					+ agendaChecker
							.isTheInputInGivenPeriods(dateTobeChecked[i]));
			
		}
		}catch(Exception e){}
	/*	
		try (Scanner scanner = new Scanner(System.in)) {
			do {

				System.out.println("Enter date in (YYYY/MM/DD) format : ");
				dateTobeChecked = scanner.nextLine();

				System.out.println("Is Date within Range : "
						+ agendaChecker
								.isTheInputInGivenPeriods(dateTobeChecked));
				System.out.println("Do you want to continue? (Y/N)");
			} while ("Y".equalsIgnoreCase(scanner.nextLine()));
		};*/

	}

	public void createPeriods(String[][] input) throws ParseException {
		List<Period> periods = new ArrayList<Period>();
		for (String[] dates : input) {
			Period period = new Period(Utility.formatDate(dates[0],
					Utility.FORMAT_YYYY_MM_DD), Utility.formatDate(dates[1],
					Utility.FORMAT_YYYY_MM_DD));
			periods.add(period);
		}

		this.periods = periods;

	}

	public boolean isTheInputInGivenPeriods(String inputDate)
			throws ParseException {

		Date date = Utility.formatDate(inputDate, Utility.FORMAT_YYYY_MM_DD);

		for (Period period : periods) {
			if (period.isWithinRange(date)) {
				return true;
			}
		}

		return false;
	}

}
