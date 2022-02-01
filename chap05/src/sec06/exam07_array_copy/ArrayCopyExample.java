package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i =0; i<5; i++) {
			System.out.println(newStrArray[i]);
		}
		// String 객체의 기본값은 0이 아니라 null.
	}

}
