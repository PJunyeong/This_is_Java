package sec02.exam01_none_generic_type;

public class Box {
	private Object object;
	public void set(Object object) {
		// 모든 자바 객체가 Object로 올 수 있다.
		this.object = object;	
	}
	public Object get() {
		return this.object;
	}
}
