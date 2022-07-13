package G1_클래스_기본이론;

class Sample0 {
	int a;
	int b;
}

public class 클래스1_기본이론2_메모리구조1 {
	public static void main(String[] args) {

		Sample0 s = new Sample0(); // 아래서 new 를 하면 가비지 컬랙터가 알아서 메모리해제해줌
// 가비지 컬랙터 사용하지 않는 메모리를 알아서 해제해줌
		s = new Sample0();
		s = null; // 메모리해제 // 가비지 컬랙터가 알아서 메모리해제해줌

	}
}