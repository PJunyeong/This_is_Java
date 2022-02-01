package sec15.exam01_annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		// Service Ŭ�������� ����� �޼ҵ带 �޾ƿ´�. �޼ҵ� �迭 �ּҸ� �����Ѵ�.
		for (Method method: declaredMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				// �ش� �޼ҵ忡 annotation�� ����Ǿ� �ִ��� Ȯ���Ѵ�.
				// ����Ǿ� �ִٸ� �� Ŭ������ annotation�� �����´�.
				
				System.out.println("[" + method.getName() + "]");
				for (int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				// �� annotation�� ����� value, number�� ���� ��¿� ����Ѵ�.
				System.out.println();
				try {
					method.invoke(new Service());
					// �ش� Service ��ü�� ���� �� ȣ���Ѵ�. ���� ó���� �Ǵ��� üũ.
				} catch (Exception e) {}
				System.out.println();
			}
		}
		
	}

}
