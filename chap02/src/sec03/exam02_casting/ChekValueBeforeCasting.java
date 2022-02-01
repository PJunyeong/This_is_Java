package sec03.exam02_casting;

public class ChekValueBeforeCasting {

	public static void main(String[] args) {
		int i = 125;
		//byte b = i;
		// 4바이트는 1바이트에 들어갈 수 없다.

		//byte b = (byte) i;
		// 128이 바이트 범위를 초과하므로 저장 불가능
		//System.out.println(b);
		
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해주세요.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
	}

}
