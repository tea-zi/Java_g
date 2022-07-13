package G2_클래스배열1_알고리즘;

class DD {
	int a;
	int b;
}

public class 클래스배열1_알고리즘_주소4 {
	public static void main(String[] args) {

		DD[] ddList = new DD[3];

		DD d1 = new DD();
		d1.a = 100;
		ddList[0] = d1;

		d1 = new DD();
		d1.a = 200;
		ddList[1] = d1;

		d1 = new DD();
		d1.a = 300;
		ddList[2] = d1;

		// 실행전 예상하기
//		[ 100
//		  200
//		  300 ]
		for (int i = 0; i < ddList.length; i++) {
			System.out.println(ddList[i].a);
		}
	}
}