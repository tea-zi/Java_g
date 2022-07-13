package G3_클래스배열2_프로젝트;

import java.util.Random;

class Card {
	String shape;
	String number;
}

public class 클래스배열2_프로젝트_카드게임 {
	public static void main(String[] args) {

		// 카드게임
		// 1) 카드모양 : 다이아 , 하트 , 스페이드 , 클로버
		// 2) 숫자 : 1~10 , j , q , k

		// 총 52개의 카드를 만들어보자
		int size = 52;
		String shape[] = { "다이아", "하트", "스페이드", "클로버" };
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