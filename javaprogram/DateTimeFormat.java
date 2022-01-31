package javaprogram;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class DateTimeFormat {

	public static void main(String[] args) {
		
		//DateTimeFormat dft=DateTimeFormat.of
		// TODO Auto-generated method stub
		/*
		 * DateTimeFormatter dft=DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		 * //System.out.println(" Current date : "+System.currentTimeMillis());
		 * 
		 * //long currentDateMillis=System.currentTimeMillis(); LocalDateTime
		 * currentTime= LocalDateTime.now();
		 * System.out.println("Current time is : "+currentTime);
		 * System.out.println("Current date and time is : "+dft.format(currentTime));
		 */
		
		SimpleDateFormat df= new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Date d = new Date();
		System.out.println("currnt time using simple date format : "+df.format(d));
		
		
		


	}

}
