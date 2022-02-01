package sec05.exam03_button_event;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	// ���� listener�� Ÿ�Կ� ���� onClick �޼ҵ带 ó���Ѵ�.
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		void onClick();
	}
	
	// �ܺ� touch -> onClick �����Ѵ�. 
}
