package verify.Exercise07;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		snowTire.run();
		tire.run();
		// 타입 변환이 일어났다 할지라도 '오버라이딩'된 메소드 호출.
	}

}
