package sec04.exam01_field;

public class UsingThis {
	public int outterField = 10;
	class Inner{
		int innerField = 20;
		void method() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterfield: " + UsingThis.this.outterField);
				System.out.println("innterfield: " + this.innerField);
			};
			fi.method();
		}
	}
	
}
