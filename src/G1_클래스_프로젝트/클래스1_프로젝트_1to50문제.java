package G1_Ŭ����_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3�ܰ�] : 1 to 18
 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
 * 4. ���� 1~9�� front �迭�� �����ϰ�,
 *    ���� 10~18�� back �迭�� �����Ѵ�.
 */

class Game1to50 {
	final int SIZE = 9;
	int[] front = new int[SIZE];
	int[] back = new int[SIZE];
}

public class Ŭ����1_������Ʈ_1to50���� {
	public static void main(String[] args) {
		Game1to50 g = new Game1to50();
		int idx = 0;
		for (int i = 1; i <= 18; i++) {
			if (i <= 9) {
				g.front[idx] = i;
				idx++;
			}
			if (i > 9) {
				g.back[idx] = i;
				idx++;
			}
			if (idx >= g.SIZE) {
				idx = 0;
			}
		}
		System.out.println(Arrays.toString(g.front));
		System.out.println(Arrays.toString(g.back));
		Random ran = new Random();
		for (int i = 0; i < 30; i++) {
			int r1 = ran.nextInt(g.SIZE);
			int r2 = ran.nextInt(g.SIZE);
			int temp = g.front[r1];
			g.front[r1] = g.front[r2];
			g.front[r2] = temp;
		}
		int map[][] = new int[3][3];
		idx = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = g.front[idx];
				idx++;
			}
		}
		Scanner scan = new Scanner(System.in);
		int cnt = 1;
		idx = 0;
		while (true) {
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					System.out.printf("[%2d]", map[i][j]);
				}
				System.out.println();
			}
			System.out.print("y : ");
			int y = scan.nextInt();
			System.out.print("x : ");
			int x = scan.nextInt();
			if (cnt == map[y][x]) {
				map[y][x] = 0;
				cnt++;
			}
			if (idx < g.SIZE) {
				if (map[y][x] == 0) {
					map[y][x] = g.back[idx];
					idx++;
				}
			}
			if (cnt > 18) {
				break;
			}
		}
	}
}