package sec08.exam02_return;

public class Car {
	int gas;
	
	void setGat(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (this.gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		} else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if (this.gas >0) {
				System.out.println("주행 중 (gas: " + this.gas + ")");
				this.gas -= 1;
			} else {
				System.out.println("정지 (gas: " + this.gas + ")");
				break;
			}
			
		}
		return;
	}

}
