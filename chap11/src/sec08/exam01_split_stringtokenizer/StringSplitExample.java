package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "AAA&BBB,CCC,DDD-EEE";
		String[] names = text.split("&|,|-");
		for (String name: names) {
			System.out.println(name);
		}
		
	}

}
