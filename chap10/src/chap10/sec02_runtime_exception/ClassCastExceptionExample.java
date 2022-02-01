package chap10.sec02_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog dog = (Dog) animal;
		changeDog(new Dog());
		changeDog(new Cat());
		// Cat cat = (Cat) animal;
		// ���� animal�� Dog Ŭ�����̹Ƿ� Cat Ŭ������ ĳ���� �Ұ����ϴ�.
	
	}
	
	public static void changeDog(Animal animal) {
		//Dog dog = (Dog) animal;
		// �Ķ���ͷ� ���޹��� animal Ŭ���� Ÿ�� ������ ���� ĳ�����Ѵ�.
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
