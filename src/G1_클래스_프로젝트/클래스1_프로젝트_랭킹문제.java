package G1_Ŭ����_������Ʈ;

import java.util.Arrays;

class Rank {
	int score[] = { 10, 30, 100, 30 };
	int rank[] = new int[4];
}

public class Ŭ����1_������Ʈ_��ŷ���� {
	public static void main(String[] args) {
		// 1) ��ũ Ŭ������ �����.
		// 2) ������ ����ؼ� rank �� ����� �����Ѵ�.
		// [����] �����ڰ� ������� ����� ���� �����ϰ� ���� �����л���
		// �����ڸ�ŭ ���� ����� �����Ѵ�.
		// ��) ���� ������ 10 , 30 , 100, 30
		// ==> ����� 4,2,1,2 �̴�.
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