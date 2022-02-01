package sec04.exam01_nested_interface;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("문자를 받습니다.");
	}
	
}
