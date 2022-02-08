package sec02.exam02_generic_type;

public class Box<T> {
	private T object;
	public void set(T t) {
		this.object= t;
	}
	public T get() {
		return this.object;
	}
}
