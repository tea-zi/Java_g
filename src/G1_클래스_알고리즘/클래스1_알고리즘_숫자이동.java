package G1_Ŭ����_�˰���;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # �����̵�[3�ܰ�] : Ŭ���� + ����
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
 * ��) 
 *  0 0 0 0 0 0 0 2 
 *  ����(1) ������(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

class GameMove {
	int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
}

public class Ŭ����1_�˰���_�����̵� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GameMove game = new GameMove();
		int index = 0;
		int size = game.game.length;
		for (int i = 0; i < size; i++) {
			if (game.game[i] == 2) {
				index = i;
			}
		}
		while (true) {
			System.out.println(Arrays.toString(game.game));
			System.out.print("[1.left][2.right][3.break][0.exit]");
			int sel = scan.nextInt();
			if (sel == 1) {
				game.game[index] = 0;
				index--;
				if (index < 0) {
					index = size - 1;
				}
				if (game.game[index] == 1) {
					System.out.println("�̵� �Ұ� ���� �ֽ��ϴ�.");
					index++;
				}
				game.game[index] = 2;
			} else if (sel == 2) {
				game.game[index] = 0;
				index++;
				if (index >= size) {
					index = 0;
				}
				if (game.game[index] == 1) {
					System.out.println("�̵� �Ұ� ���� �ֽ��ϴ�.");
					index--;
				}
				game.game[index] = 2;
			} else if (sel == 3) {
				System.out.println("����!!!");
				if (index - 1 >= 0) {
					if (game.game[index - 1] == 1) {
						game.game[index - 1] = 0;
					}
				}
				if (index + 1 < size) {
					if (game.game[index + 1] == 1) {
						game.game[index + 1] = 0;
					}
				}
			} else if (sel == 0) {
				break;
			}
		}
	}
}