package sec15.exam01_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("¿À´Ã? E");
		System.out.println(sdf.format(date));
	}

}
