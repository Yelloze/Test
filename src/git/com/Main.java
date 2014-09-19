package git.com;

import java.text.ParseException;

public class Main {
	static AgendaChecker agendaChecker;
	public static void main(String[] args) throws ParseException {
		initAgendaChecker();
		checkDates();
	}
	
	private static void initAgendaChecker() throws ParseException{
		String[][] dateRanges = {
			{ "2014/01/01", "2015/01/01" },
			{ "2015/02/02", "2016/01/01" },
			{ "2016/02/02", "2017/01/01" }
		};
		agendaChecker = new AgendaChecker(dateRanges);
	}
	
	private static void checkDates() throws ParseException{
		String[] datesTobeChecked = {
			"2014/05/05",
			"2013/01/01",
			"2012/01/01",
			"2016/05/05",
			"2015/01/01",
			"2015/01/02"
		};
		
		for(String date : datesTobeChecked){
			printResultFor(date);
		}
	}
	
	private static void printResultFor(String date) throws ParseException{
		boolean result = agendaChecker.isTheInputInGivenPeriods(date);
		String out = "Is <" + date + "> within Range ? : " + result;
		System.out.println(out);
	}
}
