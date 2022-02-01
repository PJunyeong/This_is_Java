package sec07.exam04_array_management;

public class Car {
	
	Tire[] tires = {
			new Tire("FL", 6),
			new Tire("FL", 6),
			new Tire("BL", 4),
			new Tire("BR", 5)
	};
	
	int run() {
		System.out.println("Car drives");
		for (int i =0; i <tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return (i+1);
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("Car stops");
	}
}
