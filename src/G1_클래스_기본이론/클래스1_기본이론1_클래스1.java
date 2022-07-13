package G1_클래스_기본이론;

class Test01 {
	int x;
	int y;
}

class Data {
	String name;
	String id;
	String pw;
	int number;
	int score;
}

public class 클래스1_기본이론1_클래스1 {
	/*
	 * # 클래스 1. 정의(설계도) 1) class : 키워드 2) Ex01 : 클래스명 3) {} : 자료형의 영역(기본 자료형을 조합해
	 * 생성) 2. 선언 1) 자료형 변수명 = new 자료형(); 2) Ex01 e = new Ex01();
	 */
	public static void main(String[] args) {

		Test01 e = new Test01(); // 클래스 : 사용자 정의 자료형(개발자가 직접 만듬)
		e.x = 10;
		e.y = 20;

		System.out.println(e); // 주소가나온다. 클래스도 주소변수이다.
		System.out.println(e.x);
		System.out.println(e.y);

		// 클래스 이전
		String[] data = { "김철수", "qwer", "1234", "1", "30" };
		int number = Integer.parseInt(data[3]);
		System.out.println(number);
		int score = Integer.parseInt(data[4]);
		System.out.println(score);

		//
		Data cData = new Data(); // 데이터 할당
		cData.id = "이만수";
		cData.pw = "2345";
		cData.id = "asdf";
		cData.number = 2;
		cData.score = 54;

	}

}