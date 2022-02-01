package verify.Exercise15;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean isLogin = memberService.login("hong", "12345");
		
		if (isLogin) {
			System.out.println("로그인 되었습니다.");
			memberService.logout();
		} else {
			System.out.println("로그인 하지 못했습니다.");
		}
	}

}
