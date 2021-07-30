package com.test01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract  class AbstractTest {
	public abstract String dayInfo();
		
	
	public static AbstractTest getInstance() {
			
		
		GregorianCalendar cal = new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		//1이 일요일이다. 요일에 따른 정수 값을 가져온다.
		
		switch(day) {
		case 1: return new Sunday();
		case 2:	return new Monday();
		case 3: return new Tuesday();
		case 4: return new Wednesday();
		case 5: return new Thursday();
		case 6: return new Friday();
		case 7: return new Saturday();
			
		}
		
		return null;
	}
}
