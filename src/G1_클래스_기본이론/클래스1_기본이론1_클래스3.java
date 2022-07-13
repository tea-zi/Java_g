package G1_클래스_기본이론;

class Test03 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class 클래스1_기본이론1_클래스3 {
	public static void main(String[] args) {
		Test03 t3 = new Test03();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int sum = 0;
		for (int i = 0; i < t3.arr.length; i++) {
			sum += t3.arr[i];
		}
		System.out.println(sum);
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		sum = 0;
		for (int i = 0; i < t3.arr.length; i++) {
			if (t3.arr[i] % 4 == 0) {
				sum += t3.arr[i];
			}
		}
		System.out.println(sum);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int count = 0;
		for (int i = 0; i < t3.arr.length; i++) {
			if (t3.arr[i] % 4 == 0) {
				System.out.print(t3.arr[i] + " ");
				count++;
			}
		}
		System.out.println("\n" + count);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		count = 0;
		for (int i = 0; i < t3.arr.length; i++) {
			if (t3.arr[i] % 2 == 0) {
				System.out.print(t3.arr[i] + " ");
				count++;
			}
		}
		System.out.println("\n" + count);
	}
}