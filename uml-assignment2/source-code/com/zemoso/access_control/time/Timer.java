package com.zemoso.access_control.time;

import java.util.Calendar;

import com.zemoso.access_control.constants.Constants;

public class Timer {
	
	private static final Calendar now = Calendar.getInstance();
	
	public static int getCurrentHour() {
	      return now.get(Calendar.HOUR_OF_DAY);
	}
	
	public static int getCurrentMinutes() {
		return now.get(Calendar.MINUTE);
	}
	
	private static int getClosingHour() {
		return Constants.CLOSING_HOUR;
	}
	private static int getOpeningHour() {
		return Constants.OPENING_HOUR;
	}
	public static boolean checkCurrentTime() {
		int currHour=getCurrentHour();
		if(currHour<getClosingHour() && currHour>getOpeningHour()) {
			return true;
		}
		else return false;
	}
}
