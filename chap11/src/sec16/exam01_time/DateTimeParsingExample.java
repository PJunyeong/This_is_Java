package sec16.exam01_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {

	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		localDate = LocalDate.parse("2022-02-07");
		System.out.println(localDate);
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2022-05-21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2022.05.21", formatter);
		System.out.println(localDate);
		
		
	}

}
