package G3_Ŭ�����迭2_������Ʈ;

import java.util.Random;

class Card {
	String shape;
	String number;
}

public class Ŭ�����迭2_������Ʈ_ī����� {
	public static void main(String[] args) {

		// ī�����
		// 1) ī���� : ���̾� , ��Ʈ , �����̵� , Ŭ�ι�
		// 2) ���� : 1~10 , j , q , k

		// �� 52���� ī�带 ������
		int size = 52;
		String shape[] = { "���̾�", "��Ʈ", "�����̵�", "Ŭ�ι�" };
		String num[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k" };
		Card card[] = new Card[size];
		for (int i = 0; i < size;) {
			for (int j = 0; j < shape.length; j++) {
				for (int k = 0; k < num.length; k++) {
					card[i] = new Card();
					card[i].shape = shape[j];
					card[i].number = num[k];
					i++;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(card[i].shape + " " + card[i].number);
		}
	}
}