package G2_클래스배열1_알고리즘;

class BB {
	int a;
	int b;
}

public class 클래스배열1_알고리즘_주소2 {
	public static void main(String[] args) {
		BB[] bb = new BB[3];
		for (int i = 0; i < bb.length; i++) {
//			bb[i] = new BB();
			bb[i].a = 10;
			bb[i].b = 20;
		}

		// 실행전 예상하기 [bb[] = new BB() 를 안해줘서 a와 b가 생성되지 않음
		for (int i = 0; i < bb.length; i++) {
			System.out.println(bb[i].a + bb[i].b);
		}

	}
}