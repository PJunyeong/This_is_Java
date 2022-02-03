package sec16.exam01_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy�� M�� d�� hh�� mm�� ss��");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}

}
