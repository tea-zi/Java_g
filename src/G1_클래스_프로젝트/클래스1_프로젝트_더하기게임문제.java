package G1_Ŭ����_������Ʈ;

import java.util.Arrays;
import java.util.Random;

/*
 * # ���ϱ� ����
 * 1. 1���� 10 ������ ������ ���� �ߺ� ���� game �迭�� 6�� �����Ѵ�.
 * 2. 0���� 5������ ���� �� 3���� �ߺ� ���� ������ �� ���� ���� ����Ѵ�. 
 * 3. ����ڴ� �ߺ����� 3���� �ε����� ��� �� ���� ���ߴ� �����̴�.
 */

class GamePlus {
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];
	int total = 0;
}

public class Ŭ����1_������Ʈ_���ϱ���ӹ��� {
	public static void main(String[] args) {
		GamePlus g = new GamePlus();
		Random ran = new Random();
		for (int i = 0; i < g.game.length;) {
			int r = ran.nextInt(10) + 1;
			boolean check = false;
			for (int j = 0; j < g.game.length; j++) {
				if (g.game[j] == r) {
					check = true;
				}
			}
			if (check == false) {
				g.game[i] = r;
				i++;
			}
		}
		System.out.println(Arrays.toString(g.game));
		int count = 0;
		int sum = 0;
		for (int i = 0; i < g.idx.length;) {
			int r = ran.nextInt(6);
			boolean check = false;
			if (r == 0) {
				count++;
			}
			for (int j = 0; j < g.idx.length; j++) {
				if (g.idx[j] == r) {
					if (count > 1) {
						check = true;
					} else if (r != 0) {
						check = true;
					}
				}
			}
			if (check == false) {
				g.idx[i] = r;
				sum += r;
				i++;
			}

		}
		System.out.println(Arrays.toString(g.idx));
		System.out.println("�� : " + sum);
		count = 0;
		int total = 0;
		for (int i = 0; i < g.myIdx.length;) {
			int r = ran.nextInt(6);
			System.out.print("index : " + r + " ");
			boolean check = false;
			if (r == 0) {
				count++;
			}
			for (int j = 0; j < g.myIdx.length; j++) {
				if (g.myIdx[j] == r) {
					if (count > 1) {
						check = true;
					} else if (r != 0) {
						check = true;
					}
				}
			}
			if (check == false) {
				g.myIdx[i] = r;
				total += r;
				i++;
			}

		}
		System.out.println("�� :  " + total);
		if (total == sum) {
			System.out.println("����");
		}

	}
}