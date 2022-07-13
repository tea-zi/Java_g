package G3_Ŭ�����迭2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

class Member {
	int number;
	String id;
	String name;
}

class Account {
	String accountNumber;
	String password;
	int money;
	String memberId;
}

public class Ŭ�����迭2_�˰���_ATM {
	public static void main(String[] args) {
		String[][] memberData = { { "1001", "qwer", "��ö��" }, { "1002", "mmkk11", "�̿���" },
				{ "1003", "javaking123", "�ֹμ�" } };
		String[][] accountData = { { "111111111", "1234", "100000", "qwer" },
				{ "222222222", "1234", "200000", "mmkk11" }, { "333333333", "1234", "300000", "mmkk11" },
				{ "444444444", "1234", "400000", "javaking123" }, { "555555555", "1234", "500000", "qwer" },
				{ "666666666", "1234", "600000", "qwer" }, };
		Account[] accountList = new Account[accountData.length];
		Member[] memberList = new Member[memberData.length];
		Scanner scan = new Scanner(System.in);
		int memsize = memberData.length;
		int accsize = accountData.length;
		while (true) {
			String menu = "";
			menu += "[0] ���� \n";
			menu += "[1] ��data�迭���� ������ Ŭ�����迭�� ������ ��� \n";
			menu += "[2] ȸ�����̵� �Է¹ް� ���º� �ܾ����  \n";
			menu += "[3] 222222222 ���¿��� 444444444 ���·� 5000���۱��� ��ü��� \n";
			System.out.println(menu);
			int sel = scan.nextInt();
			scan.nextLine();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				for (int i = 0; i < memsize; i++) {
					Member m = new Member();
					m.number = Integer.parseInt(memberData[i][0]);
					m.id = memberData[i][1];
					m.name = memberData[i][2];
					memberList[i] = m;
				}
				for (int i = 0; i < accsize; i++) {
					Account a = new Account();
					a.accountNumber = accountData[i][0];
					a.password = accountData[i][1];
					a.money = Integer.parseInt(accountData[i][2]);
					a.memberId = accountData[i][3];
					accountList[i] = a;
				}
				for (int i = 0; i < memsize; i++) {
					System.out.println(memberList[i].number + " " + memberList[i].id + " " + memberList[i].name);
				}
				for (int i = 0; i < accsize; i++) {
					System.out.println(accountList[i].accountNumber + " " + accountList[i].password + " "
							+ accountList[i].money + " " + accountList[i].memberId);
				}
			} else if (sel == 2) {
				System.out.print("���̵� �Է� : ");
				String id = scan.nextLine();
				for (int i = 0; i < accsize; i++) {
					if (accountList[i].memberId.equals(id)) {
						System.out.println(accountList[i].accountNumber + " " + accountList[i].money);
					}
				}
			} else if (sel == 3) {
				boolean check = false;
				for (int i = 0; i < accsize; i++) {
					if (accountList[i].accountNumber.equals("222222222") && accountList[i].money >= 5000) {
						accountList[i].money -= 5000;
						check = true;
					}
					if (accountList[i].accountNumber.equals("444444444") && check == true) {
						accountList[i].money += 5000;
					}
				}
				for (int i = 0; i < memsize; i++) {
					System.out.println(memberList[i].number + " " + memberList[i].id + " " + memberList[i].name);
				}
				for (int i = 0; i < accsize; i++) {
					System.out.println(accountList[i].accountNumber + " " + accountList[i].password + " "
							+ accountList[i].money + " " + accountList[i].memberId);
				}
			}
		}

	}
}