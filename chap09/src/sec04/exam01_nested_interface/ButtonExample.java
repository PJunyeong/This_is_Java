package sec04.exam01_nested_interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch(); 
		
		btn.setOnClickListener(new MessageListener());
		btn.touch(); 
		// onClick 실행한다.
		
		btn.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick () {
				System.out.println("사진을 찍습니다.");
			}
		});
		btn.touch();
		// 익명 구현으로 바로 넘기는 게 자주 사용하는 방법이다.
	}

}
