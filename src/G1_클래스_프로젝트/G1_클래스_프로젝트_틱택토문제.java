package G1_클래스_프로젝트;

import java.util.Arrays;
import java.util.Scanner;
// # 틱택토
// === 틱택토 ===
// [X][X][O]
// [ ][O][ ]
// [ ][ ][ ]
// [p1]인덱스 입력 : 6
// === 틱택토 ===
// [X][X][O]
// [ ][O][ ]
// [O][ ][ ]
// [p1]승리

class GameTic {

	String[][] game = new String[3][3];

	int turn = 0;
	int win = 0;
}

public class G1_클래스_프로젝트_틱택토문제 {
	public static void main(String[] args) {
		GameTic t = new GameTic();
		Scanner scan = new Scanner(System.in);
		int idx[] = new int[9];
		int p = 0;
		String pc = "";
		while (true) {
			int in = 0;
			for (int i = 0; i < t.game.length; i++) {
				for (int j = 0; j < t.game.length; j++) {
					if (idx[in] == 1) {
						t.game[i][j] = "O";
					} else if (idx[in] == 2) {
						t.game[i][j] = "X";
					} else {
						t.game[i][j] = " ";
					}
					in++;
					System.out.printf("[%s]", t.game[i][j]);
				}
				System.out.println();
			}

			for (int i = 0; i < t.game.length; i++) {
				if (t.game[i][0].equals(pc) && t.game[i][1].equals(pc) && t.game[i][2].equals(pc)) {
					t.win = p;
				}
			}
			for (int i = 0; i < t.game.length; i++) {
				if (t.game[0][i].equals(pc) && t.game[1][i].equals(pc) && t.game[2][i].equals(pc)) {
					t.win = p;
				}
			}
			if (t.game[0][0].equals(pc) && t.game[1][1].equals(pc) && t.game[2][2].equals(pc)) {
				t.win = p;
			}
			if (t.game[0][2].equals(pc) && t.game[1][1].equals(pc) && t.game[2][0].equals(pc)) {
				t.win = p;
			}
			if (t.win != 0) {
				System.out.printf("[p%d]승리", t.win);
				break;
			} else if (t.win == 0 && t.turn >= 9) {
				System.out.println("Draw");
				break;
			}

			if (t.turn % 2 == 0) {
				p = 1;
				pc = "O";
			} else {
				p = 2;
				pc = "X";
			}

			System.out.printf("[p%d]인덱스 입력 : ", p);
			int index = scan.nextInt();
			if (index >= 9 || index < 0) {
				continue;
			}
			if (idx[index] == 0) {
				idx[index] = p;
			} else {
				continue;
			}
			t.turn++;
		}
	}
}