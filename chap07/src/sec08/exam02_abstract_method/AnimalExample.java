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
		// �������̵��� Dog�� sound�� ��µȴ�.
		animal = new Cat();
		animal.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
		// Ư�� �ڽ� ��ü�� �������̵��� �޼ҵ尡 ȣ��ȴ�.
	}

}
