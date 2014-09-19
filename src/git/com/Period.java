package git.com;

/**
 * 
 */


import java.util.Date;

/**
 * @author Sailaja Yelloze
 *
 */
public class Period {

	private Date startDate;

	private Date endDate;

	public Period(Date startDate, Date endDate) {
		if (startDate != null && endDate != null) {
			if (startDate.after(endDate)) {
				throw new RuntimeException(
						"Start Date must not be before End Date");
			}
			this.startDate = startDate;
			this.endDate = endDate;
		} else {
			throw new RuntimeException("Start Date, End Date must not be null");
		}

	}

	public boolean isWithinRange(Date inputDate) {

		if (startDate != null && endDate != null) {
			if (inputDate.after(startDate) && inputDate.before(endDate)) {
				return true;
			}
			if (inputDate.equals(startDate)) {
				return true;
			}

			if (inputDate.equals(endDate)) {
				return true;
			}

		}
		return false;
	}

}
