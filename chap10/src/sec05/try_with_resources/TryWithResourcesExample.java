package sec05.try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			// 자동으로 close()가 실행된다.
			//  throw new Exception();
			// 예외를 발생시킨다. -> catch Exception e
		} catch(Exception e) {
			System.out.println("예외 처리");
		}
	}

}
