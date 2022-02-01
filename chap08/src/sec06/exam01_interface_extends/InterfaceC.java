package sec06.exam01_interface_extends;

public interface InterfaceC extends InterfaceA, InterfaceB{
	public void methodC();
	//C는 인터페이스 A, B의 추상 메소드를 물려받아 총 3개를 가진다.
}
