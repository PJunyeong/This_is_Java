package sec04.exam02_local_variable;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: "+ localVar);
			// arg와 localVar은 암시적으로 final로 해석된다.
		};
		fi.method();
	}
}
