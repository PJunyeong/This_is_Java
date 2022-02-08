package sec04.exam01_generic_method;

public class Box<T> {
	private T object;
	public void set(T t) {
		this.object= t;
	}
	public T get() {
		return this.object;
	}
}
