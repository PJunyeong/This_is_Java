package sec05.exam03_method_polymoriphism;

public class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("Taxi drives");
	}

}
