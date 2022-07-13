package G1_클래스_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

class Game1to50 {
	final int SIZE = 9;
	int[] front = new int[SIZE];
	int[] back = new int[SIZE];
}

public class 클래스1_프로젝트_1to50문제 {
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