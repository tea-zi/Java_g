package G1_클래스_알고리즘;

import java.util.Arrays;
import java.util.Random;

class Test06 {
	int[] answer = { 1, 3, 4, 2, 5 }; // 시험답안
	int[] hgd = new int[5]; // 학생답안

	int cnt = 0; // 정답 맞춘 개수
	int score = 0; // 성적
}
/*
 * # OMR카드 : 클래스 + 변수 1. 배열 answer는 시험문제의 정답지이다. 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를
 * 저장한다. 3. answer와 hgd 값을 비교해 정오표를 출력한다. 4. 한 문제당 20점이다. 예) answer = {1, 3, 4,
 * 2, 5} hgd = {1, 1, 4, 4, 3} 정오표 = {O, X, O, X, X} 성적 = 40점
 */

public class 클래스1_알고리즘_OMR카드 {
	public static void main(String[] args) {
		Test06 t6 = new Test06();
		Random ran = new Random();
		System.out.println(Arrays.toString(t6.answer));
		for (int i = 0; i < t6.hgd.length; i++) {
			int r = ran.nextInt(5) + 1;
			t6.hgd[i] = r;
		}
		System.out.println(Arrays.toString(t6.hgd));
		String ox[] = new String[t6.answer.length];
		for (int i = 0; i < t6.answer.length; i++) {
			if (t6.answer[i] == t6.hgd[i]) {
				t6.cnt++;
				ox[i] = "O";
			} else {
				ox[i] = "x";
			}
		}
		System.out.println(Arrays.toString(ox));
		t6.score = t6.cnt * 20;
		System.out.println("성직 : " + t6.score);
	}
}