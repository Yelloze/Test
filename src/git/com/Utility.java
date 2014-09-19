package git.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {
	static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
	
	public static Date parseDate(String inputDate) throws ParseException{
		return simpleDateFormat.parse(inputDate);
	}
}
