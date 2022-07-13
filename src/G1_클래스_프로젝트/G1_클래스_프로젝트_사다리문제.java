package G1_클래스_프로젝트;

import java.util.Arrays;
import java.util.Scanner;
/*
 * # 사다리 게임
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.

 */

class GameLadder {
	int ladder[][] = { { 0, 0, 0, 0, 0 }, { 1, 1, 0, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0 }, { 1, 1, 0, 1, 1 },
			{ 0, 1, 1, 0, 0 }, { 0, 0, 1, 1, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 } };

	int x = 0;
	int y = 0;
	String[] menu = { "죠스떡볶이", "CU편의점", "마라탕", "김밥천국", "명인만두" };
}

public class G1_클래스_프로젝트_사다리문제 {
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
		System.out.println("오늘의 메뉴 : " + l.menu[index]);
	}
}