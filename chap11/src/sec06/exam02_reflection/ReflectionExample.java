package sec06.exam02_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("sec06.exam02_reflection.Car");
		
		System.out.println("[Class Name]");
		System.out.println(clazz.getName());
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor: constructors) {
			System.out.println(constructor.getName());
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
		}
		
		System.out.println();
		System.out.println("[Field info]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field: fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		
		System.out.println();
		System.out.println("[Method info]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method: methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
			
		}
	}
	
	private static void printParameters(Class[] parameters) {
		for (int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length - 1)) {System.out.print(",");}
		}
	}

}
