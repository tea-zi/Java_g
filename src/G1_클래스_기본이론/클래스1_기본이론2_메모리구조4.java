package G1_클래스_기본이론;

class Sample3 {
	int arr[] = { 10, 20, 30, 40, 50 };
}

public class 클래스1_기본이론2_메모리구조4 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		Sample3 s3 = new Sample3();

		Sample3 temp3 = s3;
		s3 = null;
		s3.arr = arr; // 에러발생
		// 14번라인에서 null초기화 했기때문에 s3.arr를 찾을 수 없다.

	}
}