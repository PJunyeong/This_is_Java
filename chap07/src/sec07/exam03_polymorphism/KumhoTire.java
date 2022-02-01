package sec07.exam03_polymorphism;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		this.accumulatedRotation += 1;
		if (this.accumulatedRotation < this.maxRotation) {
			System.out.println(this.location + " KumhoTire 수명: " + (this.maxRotation-this.accumulatedRotation));
			return true;
		} else {
			System.out.println(this.location + " KumhoTire 수명 X");
			return false;
		}
	}

}
