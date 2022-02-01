package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		// private으로 새로운 객체 생성을 사전에 방지했으므로 singleton이 return하는 객체는 모두 동일.
		
		System.out.println("obj1 == obj2 ?: " + (obj1 == obj2));
	}

}
