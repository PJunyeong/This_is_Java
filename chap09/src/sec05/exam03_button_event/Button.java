package sec05.exam03_button_event;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	// 들어온 listener의 타입에 따라서 onClick 메소드를 처리한다.
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();
	}
	
	// 외부 touch -> onClick 실행한다. 
}
