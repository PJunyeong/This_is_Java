package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "parent1";
		parent.method1();
		parent.method2();
		// parent.field2
		// parent.method3() 
		// parent�� Parent Ÿ���̹Ƿ� �ڽ� Child���� �ִ� ��� X
		
		Child child = (Child) parent;
		child.field2 = "child1";
		child.method3();
		// ���� Ÿ�� ĳ�������� �ʵ� �� �޼ҵ� ��� ����.
	}

}
