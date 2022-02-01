package sec04.multi_catch;

public class MultiCatchExample {

	public static void main(String[] args) {
		try{
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("check your args!");
			System.out.println("check your strings!");
		} catch (Exception e) { 
			System.out.println("other Exceptions occur!");
		} finally {
			System.out.println("Program exits");
		}
	}
	// | 파이프 기호를 중심으로 멀티 캐치가 가능하다.

}
