package G1_Ŭ����_�򰡹���;

import java.util.Arrays;

class Sample2 {
	int arr[] = { 10, 20, 30, 40, 50 };
}

public class Ŭ����1_�򰡹���_����2 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		Sample2 s2 = new Sample2();
		s2.arr = arr;

		// ����1) ���� ������ �ּ� Ǯ�� ���� - [1,2,3,4,5]
		System.out.println(Arrays.toString(s2.arr));

		s2.arr = null;
		// ����2) ���� ������ �ּ� Ǯ�� ���� - [1,2,3,4,5]
		System.out.println(Arrays.toString(arr));

	}
}