package sec07.exam01_generic_extends_implements;

public class ChildProduct<K, V, C> extends Product<K, V>{
	private C company;
	// 추가 파라미터를 가질 수 있다!

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}
