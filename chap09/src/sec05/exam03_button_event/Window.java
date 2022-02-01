package sec05.exam03_button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	// Window의 필드
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("Call");
		}
	};
	
	Window(){
		// Window의 생성자
		button1.setOnClickListener(listener);
		
		// 매개 변수에 직접 선언
		
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Text");
			}
		});
	}
	// touch 실행 시 실행된다.
}
