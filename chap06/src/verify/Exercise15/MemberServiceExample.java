package verify.Exercise15;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean isLogin = memberService.login("hong", "12345");
		
		if (isLogin) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout();
		} else {
			System.out.println("�α��� ���� ���߽��ϴ�.");
		}
	}

}
