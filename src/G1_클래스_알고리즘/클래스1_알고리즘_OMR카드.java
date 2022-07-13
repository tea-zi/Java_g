package G1_Ŭ����_�˰���;

import java.util.Arrays;
import java.util.Random;

class Test06 {
	int[] answer = { 1, 3, 4, 2, 5 }; // ������
	int[] hgd = new int[5]; // �л����

	int cnt = 0; // ���� ���� ����
	int score = 0; // ����
}
/*
 * # OMRī�� : Ŭ���� + ���� 1. �迭 answer�� ���蹮���� �������̴�. 2. �迭 hgd�� 1~5 ������ ���� ���� 5����
 * �����Ѵ�. 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�. 4. �� ������ 20���̴�. ��) answer = {1, 3, 4,
 * 2, 5} hgd = {1, 1, 4, 4, 3} ����ǥ = {O, X, O, X, X} ���� = 40��
 */

public class Ŭ����1_�˰���_OMRī�� {
	public static void main(String[] args) {
		Test06 t6 = new Test06();
		Random ran = new Random();
		System.out.println(Arrays.toString(t6.answer));
		for (int i = 0; i < t6.hgd.length; i++) {
			int r = ran.nextInt(5) + 1;
			t6.hgd[i] = r;
		}
		System.out.println(Arrays.toString(t6.hgd));
		String ox[] = new String[t6.answer.length];
		for (int i = 0; i < t6.answer.length; i++) {
			if (t6.answer[i] == t6.hgd[i]) {
				t6.cnt++;
				ox[i] = "O";
			} else {
				ox[i] = "x";
			}
		}
		System.out.println(Arrays.toString(ox));
		t6.score = t6.cnt * 20;
		System.out.println("���� : " + t6.score);
	}
}