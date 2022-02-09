package sec07.exam01_generic_extends_implements;

public class ChildProductAndStorageImpleExample {

	public static void main(String[] args) {
		ChildProduct<TV, String, String> product = new ChildProduct<>();
		product.setKind(new TV());
		product.setModel("smart tv");
		product.setCompany("samsung");
		
		Storage<TV> storage = new StorageImple<TV>(100);
		storage.add(new TV(), 0);
		TV tv = storage.get(0);
		
		
	}

}
