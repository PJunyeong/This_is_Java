package sec04.multi_catch;

public class CatchOrderExample {

	public static void main(String[] args) {
		try{
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("check your args!");
		} catch (NumberFormatException e) {
			System.out.println("check your strings!");
		} catch (Exception e) { 
			System.out.println("other Exceptions occur!");
		} finally {
			System.out.println("Program exits");
		}
		 // 상위 exception은 하단부부터 쓴다!
	}

}
