package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		// 오버라이딩된 Dog의 sound가 출력된다.
		animal = new Cat();
		animal.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
		// 특정 자식 개체가 오버라이딩한 메소드가 호출된다.
	}

}
