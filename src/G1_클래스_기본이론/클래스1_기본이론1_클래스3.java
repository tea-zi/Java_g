package G1_Ŭ����_�⺻�̷�;

class Test03 {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class Ŭ����1_�⺻�̷�1_Ŭ����3 {
	public static void main(String[] args) {
		Test03 t3 = new Test03();
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		int sum = 0;
		for (int i = 0; i < t3.arr.length; i++) {
			sum += t3.arr[i];
		}
		System.out.println(sum);
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		sum = 0;
		for (int i = 0; i < t3.arr.length; i++) {
			if (t3.arr[i] % 4 == 0) {
				sum += t3.arr[i];
			}
		}
		System.out.println(sum);
		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		int count = 0;
		for (int i = 0; i < t3.arr.length; i++) {
			if (t3.arr[i] % 4 == 0) {
				System.out.print(t3.arr[i] + " ");
				count++;
			}
		}
		System.out.println("\n" + count);
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
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