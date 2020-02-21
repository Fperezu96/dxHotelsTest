package co.com.certification.dxHotels.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDate {

	private static SimpleDateFormat dtf = new SimpleDateFormat("MM/dd/yyyy");
	private static Date date = new Date();

	public static String tomorrow() {

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		date = cal.getTime();
		return dtf.format(date);
	}

	public String manyDaysInFuture(Integer days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		date = cal.getTime();
		return dtf.format(date);
	}

	public static String today() {
		return dtf.format(date);
	}

}