package sec07.exam04_array_management;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		this.accumulatedRotation += 1;
		if (this.accumulatedRotation < this.maxRotation) {
			System.out.println(this.location + " HankookTire 수명: " + (this.maxRotation-this.accumulatedRotation));
			return true;
		} else {
			System.out.println(this.location + " HankookTire 수명 X");
			return false;
		}
	}

}
