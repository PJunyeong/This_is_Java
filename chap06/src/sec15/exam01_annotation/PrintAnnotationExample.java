package sec15.exam01_annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		// Service 클래스에서 선언된 메소드를 받아온다. 메소드 배열 주소를 저장한다.
		for (Method method: declaredMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				// 해당 메소드에 annotation에 적용되어 있는지 확인한다.
				// 적용되어 있다면 이 클래스의 annotation을 가져온다.
				
				System.out.println("[" + method.getName() + "]");
				for (int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				// 이 annotation에 저장된 value, number를 통해 출력에 사용한다.
				System.out.println();
				try {
					method.invoke(new Service());
					// 해당 Service 객체를 생성 및 호출한다. 예외 처리가 되는지 체크.
				} catch (Exception e) {}
				System.out.println();
			}
		}
		
	}

}
