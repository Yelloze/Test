package git.com;

/**
 * 
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Sailaja Yelloze
 *
 */
public class Utility {

	public static final String FORMAT_YYYY_MM_DD = "yyyy/MM/dd";
	
	public static Date formatDate(String inputDate, String format) throws ParseException{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		return simpleDateFormat.parse(inputDate);
	}
	
}
