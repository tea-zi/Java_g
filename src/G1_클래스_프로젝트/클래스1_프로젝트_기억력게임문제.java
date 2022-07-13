package G1_Ŭ����_������Ʈ;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ���� : Ŭ���� + ����
 * 1. front �迭 ī�� 10���� ���´�.
 * 2. front �迭���� ���� ī�带 ��� ī���� ��ġ�� �Է��Ѵ�.
 * 3. ������ 2���� ī�尡 ���� ī���̸�, back �迭�� ǥ���Ѵ�.
 * 4. ��� ī�尡 ��������(back�迭�� 0�� �������) ������ ����ȴ�. 
 */

class GameMemory {
	int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int[] back = new int[10];

	int cnt = 0; // ������ ���� Ƚ��
}

public class Ŭ����1_������Ʈ_���°��ӹ��� {
	public static void main(String[] args) {
		Random ran = new Random();
		GameMemory g = new GameMemory();
		for (int i = 0; i < 10; i++) {
			int r1 = ran.nextInt(10);
			int r2 = ran.nextInt(10);
			int temp = g.front[r1];
			g.front[r1] = g.front[r2];
			g.front[r2] = temp;
		}
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("index1 : ");
			int index1 = scan.nextInt();
			System.out.print("index2 : ");
			int index2 = scan.nextInt();
			if (g.front[index1] == g.front[index2]) {
				g.back[index1] = g.front[index1];
				g.back[index2] = g.front[index2];
				g.cnt++;
				System.out.println("����");
			} else {
				System.out.println("[" + g.front[index1] + "]" + "[" + g.front[index2] + "]");
			}
			if (g.cnt >= 5) {
				break;
			}
		}
	}
}