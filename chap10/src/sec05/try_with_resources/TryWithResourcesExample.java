package sec05.try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			// �ڵ����� close()�� ����ȴ�.
			//  throw new Exception();
			// ���ܸ� �߻���Ų��. -> catch Exception e
		} catch(Exception e) {
			System.out.println("���� ó��");
		}
	}

}
