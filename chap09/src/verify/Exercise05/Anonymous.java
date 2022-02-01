package verify.Exercise05;

public class Anonymous {
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("Ride a bike");
		}
		
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
				System.out.println("Car drives");
			}
			
		};
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
