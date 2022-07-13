package G1_클래스_프로젝트;

import java.util.Arrays;
import java.util.Random;

/*
 * # 더하기 게임
 * 1. 1부터 10 사이의 랜덤한 값을 중복 없이 game 배열에 6개 저장한다.
 * 2. 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해 그 수의 합을 출력한다. 
 * 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
 */

class GamePlus {
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];
	int total = 0;
}

public class 클래스1_프로젝트_더하기게임문제 {
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
		System.out.println("합 : " + sum);
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
		System.out.println("답 :  " + total);
		if (total == sum) {
			System.out.println("정답");
		}

	}
}