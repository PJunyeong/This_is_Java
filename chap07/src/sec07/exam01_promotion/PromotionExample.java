package sec07.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 =b;
		A a2 = c;
		A a3 = d;
		A a5 = e;
		
		B b1 = d;
		C c1 = e;
		
		// B b2 = e;
		// C c2 = d;
		// B와 E, C와 D는 연관관계가 없다. 상속 관계만 있는 두 부모/자식 관계만 자동타입변환 가능.
	}

}
