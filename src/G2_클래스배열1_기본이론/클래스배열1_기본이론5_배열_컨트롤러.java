package G2_Ŭ�����迭1_�⺻�̷�;

import java.util.Scanner;

/*
class Member{
	int number; String id; String pw; String name; int score;
}
 */
public class Ŭ�����迭1_�⺻�̷�5_�迭_��Ʈ�ѷ� {
	public static void main(String[] args) {

		int max = 100;
		Member[] memberList = new Member[max];

		// Ŭ�����迭�� �̿��ؼ� crud ����
		int size = 0;
		int num = 1000; // ��ȣ�� 1000���� ����
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("[1]���� [2]Ż�� [3]���� [4]�˻� [5] ��ü��� [0]����");

			int sel = scan.nextInt();
			scan.nextLine();
			if (sel == 1) {
				Member member = new Member();
				member.number = num;
				num += 1;
				System.out.println("���̵� : ");
				member.id = scan.next();
				System.out.println("��й�ȣ : ");
				member.pw = scan.next();
				System.out.println("�̸� : ");
				member.name = scan.next();
				System.out.println("���� : ");
				member.score = scan.nextInt();
				memberList[size] = member;
				size += 1;
			} else if (sel == 2) {
				System.out.print("���̵� �Է� : ");
				String id = scan.nextLine();
				int idx = -1;
				for (int i = 0; i < size; i++) {
					if (memberList[i].id.equals(id)) {
						idx = i;
					}
				}
				if (idx == -1) {
					System.out.println("id ����");
				} else {
					for (int i = idx; i < size - 1; i++) {
						memberList[i] = memberList[i + 1];
					}
					memberList[size - 1] = null;
					size--;
				}
			} else if (sel == 3) {
				while (true) {
					System.out.print("���̵� : ");
					String id = scan.nextLine();
					int idx = 0;
					boolean check = true;
					for (int i = 0; i < size; i++) {
						if (memberList[i].id.equals(id)) {
							idx = i;
							check = false;
							break;
						}
					}
					if (check == true) {
						System.out.println("�߸��� �����Դϴ�.");
						break;
					}
					System.out.println("��������� �����ϼ���.");
					System.out.print("[1.id][2.pw][3.�̸�][4.����][0.�ڷΰ���]");
					sel = scan.nextInt();
					scan.nextLine();
					if (sel == 1) {
						System.out.print("���̵� �Է� : ");
						id = scan.nextLine();
						for (int i = 0; i < size; i++) {
							if (memberList[i].id.equals(id)) {
								System.out.println("������ ���̵� ����");
								check = true;
								break;
							}
						}
						if (check == false) {
							memberList[idx].id = id;
						} else {
							continue;
						}
					} else if (sel == 2) {
						System.out.print("��й�ȣ �Է� : ");
						String pw = scan.nextLine();
						for (int i = 0; i < size; i++) {
							if (memberList[i].pw.equals(pw)) {
								System.out.println("����� �� ���� ��й�ȣ�Դϴ�.");
								check = true;
								break;
							}
						}
						if (check == false) {
							memberList[idx].pw = pw;
						} else {
							continue;
						}
					} else if (sel == 3) {
						System.out.print("�̸� �Է� : ");
						String name = scan.nextLine();
						memberList[idx].name = name;
					} else if (sel == 4) {
						System.out.print("���� �Է� : ");
						int score = scan.nextInt();
						memberList[idx].score = score;
					} else if (sel == 0) {
						break;
					}

				}
			} else if (sel == 4) {
				System.out.print("[1.id][2.�̸�][3.����][0.�ڷΰ���]");
				sel = scan.nextInt();
				System.out.print("�˻� : ");
				scan.nextLine();
				if (sel == 1) {
					String id = scan.nextLine();
					for (int i = 0; i < size; i++) {
						if (memberList[i].id.equals(id)) {
							System.out.println(
									memberList[i].id + " , " + memberList[i].name + ", " + memberList[i].score);
						}
					}
				} else if (sel == 2) {
					String name = scan.nextLine();
					for (int i = 0; i < size; i++) {
						if (memberList[i].name.equals(name)) {
							System.out.println(
									memberList[i].id + " , " + memberList[i].name + ", " + memberList[i].score);
						}
					}
				} else if (sel == 3) {
					int score = scan.nextInt();
					for (int i = 0; i < size; i++) {
						if (memberList[i].score == score) {
							System.out.println(
									memberList[i].id + " , " + memberList[i].name + ", " + memberList[i].score);
						}
					}
				} else if (sel == 0) {
					break;
				}

			} else if (sel == 5) {
				for (int i = 0; i < size; i++) {
					System.out.println(memberList[i].number + " " + memberList[i].id);
				}
			} else if (sel == 0) {
				break;
			}
		}
	}
}