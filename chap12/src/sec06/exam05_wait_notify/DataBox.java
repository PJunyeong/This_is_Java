package sec06.exam05_wait_notify;

public class DataBox {
	private String data;
	//null�� �� ��ٸ��� ������ ������ �ش�

	public synchronized String getData() {
		
		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		
		String returnValue = data;
		System.out.println("ConsumerThread reads " + returnValue);
		data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		} else {
			this.data = data;
			System.out.println("ProducerThread writes " + data);
			notify();
		}
	}
}
