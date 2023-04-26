package daily0426;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Calculator {

	public int calcAge(long address) {
		int age = 0;
		
		Date date= new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		int currYear = cal.get(Calendar.YEAR);
		int currMonth = cal.get(Calendar.MONTH);
		int currDay = cal.get(Calendar.DATE);
		
		age = (int) ((currYear - (address/100000000000L)) % 100);
		
		int month = (int) (((address/10000000)%10000)/100);
		int day = (int) ((address/10000000)%100);
			
		if(currMonth - month < 0 || (currMonth - month == 0 && currDay - day < 0)) age--;
		
		return age;
	}
	
	public static int calcPrice(int type, int age, int num, int prefer) {
		int price = 0;
		
		if(age >=65) {
			if(type == 1) price = 44000;
			if(type == 2) price = 37000;
		}
		else if(age >= 19) {
			if(type == 1) price = 56000;
			if(type == 2) price = 46000;
		}
		else if(age >= 13) {
			if(type == 1) price = 47000;
			if(type == 2) price = 40000;
		}
		else if(age >= 3) {
			if(type == 1) price = 44000;
			if(type == 2) price = 37000;
		}
		else if(age <= 2) {
			price = 0;
		}
		
		price *= num;
		
		if(prefer == 2) {
			price *= 0.6;
		}
		if(prefer == 3) {
			price *= 0.5;
		}
		if(prefer == 4) {
			price *= 0.8;
		}
		if(prefer == 5) {
			price *= 0.85;
		}
		
		return price;
	}
}
