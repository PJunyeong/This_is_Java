package verify.Exercise20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	// Ŭ���� �迭
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1. ���� ���� 2. ���� ��� 3. ���� 4. ��� 5. ����");
			System.out.println("----------------------------");
			System.out.print("����>");
			
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
				System.out.println("�ٽ� �Է�");
			}
		}
		System.out.println("���α׷� ����");
	}
	
	private static void withdraw() {
		System.out.println("------------------------");
		System.out.println("���");
		System.out.println("------------------------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("���� ���� ����");
			return;
		} else {
			System.out.print("��ݾ�: ");
			int balance = scanner.nextInt();
			if (balance > account.getBalance()) {
				System.out.println("���� �������� ��� ����");
				return;
			} else {
				account.setBalance(account.getBalance()-balance);
				System.out.println("��� �Ϸ�");
				return;
			}
		}
	}

	private static void deposit() {
		System.out.println("------------------------");
		System.out.println("����");
		System.out.println("------------------------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("���� ���� ����");
			return;
		} else {
			System.out.print("���ݾ�: ");
			int balance = scanner.nextInt();
			balance += account.getBalance();
			account.setBalance(balance);
			System.out.println("���� �Ա� �Ϸ�");
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
		System.out.println("���� ���");
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
		System.out.println("���� ����");
		System.out.println("------------------------");
		
		System.out.print("���� ��ȣ: ");
		String ano = scanner.next();
		System.out.print("�̸�: ");
		String owner = scanner.next();
		System.out.print("�Աݾ�: ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("���� ���� �Ϸ�");
				break;
			}
		}
	}
	
	

}
