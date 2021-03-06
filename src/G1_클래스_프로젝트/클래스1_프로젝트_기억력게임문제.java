package G1_클래스_프로젝트;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class GameMemory {
	int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int[] back = new int[10];

	int cnt = 0; // 정답을 맞춘 횟수
}

public class 클래스1_프로젝트_기억력게임문제 {
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
				System.out.println("정답");
			} else {
				System.out.println("[" + g.front[index1] + "]" + "[" + g.front[index2] + "]");
			}
			if (g.cnt >= 5) {
				break;
			}
		}
	}
}