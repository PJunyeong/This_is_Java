package sec06.exam01_interface_extends;

public class ImplementationExample {
	public static void main(String[] args) {
		ImplementationC implC = new ImplementationC();
		
		InterfaceA ia = implC;
		ia.methodA();
		InterfaceB ib = implC;
		ib.methodB();
		InterfaceC ic = implC;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		//�������̽��� ���� ���� ������ �޼ҵ��� ������ �ٸ���.
		
	}
}
