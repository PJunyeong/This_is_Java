package verify.Exercise13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPrintExample {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�ð� hh�� mm��");
		System.out.println(sdf.format(now));
	}

}
