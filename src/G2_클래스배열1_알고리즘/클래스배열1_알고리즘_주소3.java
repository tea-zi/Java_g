package G2_클래스배열1_알고리즘;

class CC {
	int a;
	int b;
}

public class 클래스배열1_알고리즘_주소3 {
	public static void main(String[] args) {
		CC[] ccList = new CC[3];
		for (int i = 0; i < ccList.length; i++) {
			ccList[i] = new CC();
			ccList[i].a = 10;
			ccList[i].b = 20;
		}

		CC cc = ccList[0];
		cc.a = 100;

		// 실행전 예상하기
//		[ 120 
//		  30 
//		  30 ]
		for (int i = 0; i < ccList.length; i++) {
			System.out.println(ccList[i].a + ccList[i].b);
		}

	}
}