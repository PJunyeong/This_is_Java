package sec13.exam01_math;

public class MathExample {

	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println(v1 + " " + v2);
		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println(v3 + " " + v4);
		
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println(v5 + " " + v6);
		
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.512, 8.794);
		System.out.println(v7 + " " + v8);
		
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.512, 8.794);
		System.out.println(v9 + " " + v10);
		
	}

}
