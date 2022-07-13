package G1_Ŭ����_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;
/*
 * # ��ٸ� ����
 * 1. 0�� ������ �Ʒ��� ��������.
 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.

 */

class GameLadder {
	int ladder[][] = { { 0, 0, 0, 0, 0 }, { 1, 1, 0, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0 }, { 1, 1, 0, 1, 1 },
			{ 0, 1, 1, 0, 0 }, { 0, 0, 1, 1, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 } };

	int x = 0;
	int y = 0;
	String[] menu = { "�ҽ�������", "CU������", "������", "���õ��", "���θ���" };
}

public class G1_Ŭ����_������Ʈ_��ٸ����� {
	public static void main(String[] args) {
		GameLadder l = new GameLadder();
		Scanner scan = new Scanner(System.in);
		int sel = scan.nextInt();
		int index = 0;
		for (int i = 0; i < l.ladder.length; i++) {
			if (l.ladder[i][sel] == 1) {
				l.ladder[i][sel] = 8;
				if (sel - 1 >= 0 && l.ladder[i][sel - 1] == 1) {
					sel--;
					l.ladder[i][sel] = 8;
				}
				if (sel + 1 < l.ladder.length && l.ladder[i][sel + 1] == 1) {
					sel++;
					l.ladder[i][sel] = 8;
				}
			} else {
				l.ladder[i][sel] = 8;
			}
			System.out.println(Arrays.toString(l.ladder[i]));
			if (i == l.ladder.length - 1) {
				index = sel;
			}
		}
		System.out.println("������ �޴� : " + l.menu[index]);
	}
}