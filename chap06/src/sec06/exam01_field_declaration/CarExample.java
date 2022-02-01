package sec06.exam01_field_declaration;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		// new를 통해 객체 생성. Car는 생성자.
		System.out.println("제적회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		myCar.speed = 300;
		System.out.println("현재속도: " + myCar.speed);
		
		// 스택 영역의 myCar를 통해 힙 영역의 Car 객체에 접근한다.
		// Car 객체 안의 Company 필드에 저장된 값을 '.'을 통해 접근한다.
		
	}

}
