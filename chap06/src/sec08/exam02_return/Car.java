package sec08.exam02_return;

public class Car {
	int gas;
	
	void setGat(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (this.gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		} else {
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if (this.gas >0) {
				System.out.println("���� �� (gas: " + this.gas + ")");
				this.gas -= 1;
			} else {
				System.out.println("���� (gas: " + this.gas + ")");
				break;
			}
			
		}
		return;
	}

}
