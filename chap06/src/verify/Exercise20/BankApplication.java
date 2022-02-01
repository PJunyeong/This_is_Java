package verify.Exercise20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	// 클래스 배열
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1. 계좌 생성 2. 계좌 목록 3. 예금 4. 출금 5. 종료");
			System.out.println("----------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("다시 입력");
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void withdraw() {
		System.out.println("------------------------");
		System.out.println("출금");
		System.out.println("------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌 정보 없음");
			return;
		} else {
			System.out.print("출금액: ");
			int balance = scanner.nextInt();
			if (balance > account.getBalance()) {
				System.out.println("예금 부족으로 출금 실패");
				return;
			} else {
				account.setBalance(account.getBalance()-balance);
				System.out.println("출금 완료");
				return;
			}
		}
	}

	private static void deposit() {
		System.out.println("------------------------");
		System.out.println("예금");
		System.out.println("------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌 정보 없음");
			return;
		} else {
			System.out.print("예금액: ");
			int balance = scanner.nextInt();
			balance += account.getBalance();
			account.setBalance(balance);
			System.out.println("예금 입금 완료");
			return;
		}
	}
	
	private static Account findAccount(String ano) {
		for (Account account : accountArray) {
			if (account == null) {
				return null;
			} else if (account.getAno().equals(ano)) {
				return account;
			}
		}
		return null;
	}

	private static void accountList() {
		System.out.println("------------------------");
		System.out.println("계좌 목록");
		System.out.println("------------------------");
		
		for (Account account : accountArray) {
			if (account == null) {
				break;
			}
			String ano = account.getAno();
			String owner = account.getOwner();
			int balance = account.getBalance();
			System.out.println(ano + "\t" + owner + "\t" + balance);
		}
	}

	private static void createAccount() {
		System.out.println("------------------------");
		System.out.println("계좌 생성");
		System.out.println("------------------------");
		
		System.out.print("계좌 번호: ");
		String ano = scanner.next();
		System.out.print("이름: ");
		String owner = scanner.next();
		System.out.print("입금액: ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("계좌 생성 완료");
				break;
			}
		}
	}
	
	

}
