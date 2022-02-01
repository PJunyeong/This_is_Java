package chap10.sec02_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog dog = (Dog) animal;
		changeDog(new Dog());
		changeDog(new Cat());
		// Cat cat = (Cat) animal;
		// 현재 animal은 Dog 클래스이므로 Cat 클래스로 캐스팅 불가능하다.
	
	}
	
	public static void changeDog(Animal animal) {
		//Dog dog = (Dog) animal;
		// 파라미터로 전달받은 animal 클래스 타입 변수를 강제 캐스팅한다.
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("Dog convert O");
		} else {
			System.out.println("Dog convert X");
		}
	}
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
