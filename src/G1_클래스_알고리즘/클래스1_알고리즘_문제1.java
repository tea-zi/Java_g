package G1_Ŭ����_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Test04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class Ŭ����1_�˰���_����1 {
	public static void main(String[] args) {
		Random ran = new Random();
		Test04 t4 = new Test04();
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		System.out.println("���� 1");
		int arr[] = { 87, 11, 92, 14, 47 };
		int size = t4.scores.length;
		for (int i = 0; i < size; i++) {
			t4.scores[i] = arr[i];
//					ran.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(t4.scores));
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		System.out.println("���� 2");
		int total = 0;
		double avg = 0;
		for (int i = 0; i < size; i++) {
			total += t4.scores[i];
		}
		avg = total / 5.0;
		System.out.println("���� : " + total + " ��� : " + avg);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		System.out.println("���� 3");
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (t4.scores[i] >= 60) {
				count++;
			}
		}
		System.out.println("�հ��ڼ� : " + count);
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		System.out.println("���� 4");
		Scanner scan = new Scanner(System.in);
		System.out.print("�ε��� �Է� : ");
		int index = scan.nextInt();
		System.out.println("���� : " + t4.scores[index]);
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		System.out.println("���� 5");
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		for (int i = 0; i < size; i++) {
			if (score == t4.scores[i]) {
				System.out.println("�ε��� : " + i);
				break;
			}
		}
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 92��
		System.out.println("���� 6");
		System.out.print("�й� �Է� : ");
		int num = scan.nextInt();
		for (int i = 0; i < size; i++) {
			if (num == t4.hakbuns[i]) {
				System.out.println("���� : " + t4.scores[i]);
			}
		}
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		System.out.println("���� 7");
		boolean check = false;
		System.out.print("�й� �Է� : ");
		num = scan.nextInt();
		for (int i = 0; i < size; i++) {
			if (num == t4.hakbuns[i]) {
				check = true;
				System.out.println("���� : " + t4.scores[i]);
			}
		}
		if (check == false) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
		}
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1003��(92��)
		System.out.println("���� 8");
		int max = 0;
		int maxindex = 0;
		for (int i = 0; i < size; i++) {
			if (max < t4.scores[i]) {
				max = t4.scores[i];
				maxindex = i;
			}
		}
		System.out.println(t4.hakbuns[maxindex] + "��(" + t4.scores[maxindex] + "��)");
	}
}