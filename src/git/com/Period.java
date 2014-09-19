package git.com;

import java.util.Date;

public class Period {
	private Date startDate;
	private Date endDate;

	public Period(Date startDate, Date endDate) throws RuntimeException {
		validateDates(startDate, endDate);
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public void validateDates(Date startDate, Date endDate) throws RuntimeException{
		if (startDate == null && endDate == null)
			throw new RuntimeException("Start Date, End Date must not be null");
		if (startDate.after(endDate))
			throw new RuntimeException( "Start Date must not be before End Date");
	}
	
	public boolean isWithinRange(Date inputDate) {
		if (inputDate.after(startDate) && inputDate.before(endDate)) {
			return true;
		}
		if (inputDate.equals(startDate)) {
			return true;
		}
		if (inputDate.equals(endDate)) {
			return true;
		}
		return false;
	}
}
