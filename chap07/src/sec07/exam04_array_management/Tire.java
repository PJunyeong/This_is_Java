package sec07.exam04_array_management;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		this.accumulatedRotation += 1;
		if (this.accumulatedRotation < this.maxRotation) {
			System.out.println(this.location + " Tire 수명: " + (this.maxRotation-this.accumulatedRotation));
			return true;
		} else {
			System.out.println(this.location + " Tire 수명 X");
			return false;
		}
	}
	
	
}
