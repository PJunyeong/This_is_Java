package sec03.exam03_localclass_access;

public class Outter {
	// ~Java 7
	public void method1(final int arg) {
		int localVariable = 1;
		class Inner{
			void method() {
				// int arg = 10;
				// int localVariable = 1;
				// final�� ���� �����Ϸ��� �޼ҵ� ���ο� �������ش�.
				int result = arg + localVariable;
			}
		}
	}
	
	// Java 8~
	
	public void method2(int arg) {
		int localVariable = 1;
		// final Ư���� ���� ����. Java 8 �̻�.
		class Inner{
			void method() {
				// final�� ������ ������ �ʵ�� ����ȴ�.
				// int arg = 10;
				// int localVariable = 1;
				// final�� ���� �����Ϸ��� �޼ҵ� ���ο� �������ش�.
				int result = arg + localVariable;
			}
		}
	}
}
