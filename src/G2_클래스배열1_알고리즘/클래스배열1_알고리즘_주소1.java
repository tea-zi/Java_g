package G2_클래스배열1_알고리즘;

class AA {
	int a;
	int b;
}

public class 클래스배열1_알고리즘_주소1 {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.a = 10;
		aa = new AA();
		aa.b = 20;

		// 실행전 예상하기 [20]
		System.out.println(aa.a + aa.b);
	}
}