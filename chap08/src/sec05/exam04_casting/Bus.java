package sec05.exam04_casting;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("Bus drives");
	}
	
	public void checkFare() {
		System.out.println("Fare checked");
	}

}
