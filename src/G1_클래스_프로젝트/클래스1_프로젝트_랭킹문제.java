package G1_클래스_프로젝트;

import java.util.Arrays;

class Rank {
	int score[] = { 10, 30, 100, 30 };
	int rank[] = new int[4];
}

public class 클래스1_프로젝트_랭킹문제 {
	public static void main(String[] args) {
		// 1) 랭크 클래스를 만든다.
		// 2) 점수에 기반해서 rank 에 등수를 저장한다.
		// [조건] 동점자가 있을경우 등수는 같게 저장하고 다음 점수학생은
		// 동점자만큼 뒤의 등수를 저장한다.
		// 예) 지금 점수가 10 , 30 , 100, 30
		// ==> 등수는 4,2,1,2 이다.
		Rank rank = new Rank();
		for (int i = 0; i < rank.rank.length; i++) {
			int count = 0;
			for (int j = 0; j < rank.rank.length; j++) {
				if (i != j) {
					if (rank.score[i] >= rank.score[j]) {
						count++;
					}
				}
			}
			rank.rank[i] = rank.rank.length - count;
		}
		System.out.println(Arrays.toString(rank.rank));
	}
}