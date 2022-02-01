package sec07.exam03_constructor_overloading;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
	}
	//다른 생성자가 선언되면 기본 생성자는 선언되지 않으므로 명시적으로 선언할 필요가 있다.
	Car(String model){
		// this.model = model;
		this(model, null, 0);
	}
	Car(String model, String color){
		// this.model = model;
		// this.color = color;
		this(model, color, 0);
	}
	// 중복 코드를 줄이기 위해 생성자 '맨 위 코드'에서 this() 호출해서 공통된 파라미터를 전달하고 나머지는 기본값으로.
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	// 파라미터 선언 순서, 타입, 개수에 따라 서로 다른 생성자를 선언할 수 있다.
}
