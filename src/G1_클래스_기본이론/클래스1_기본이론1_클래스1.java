package G1_Ŭ����_�⺻�̷�;

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

public class Ŭ����1_�⺻�̷�1_Ŭ����1 {
	/*
	 * # Ŭ���� 1. ����(���赵) 1) class : Ű���� 2) Ex01 : Ŭ������ 3) {} : �ڷ����� ����(�⺻ �ڷ����� ������
	 * ����) 2. ���� 1) �ڷ��� ������ = new �ڷ���(); 2) Ex01 e = new Ex01();
	 */
	public static void main(String[] args) {

		Test01 e = new Test01(); // Ŭ���� : ����� ���� �ڷ���(�����ڰ� ���� ����)
		e.x = 10;
		e.y = 20;

		System.out.println(e); // �ּҰ����´�. Ŭ������ �ּҺ����̴�.
		System.out.println(e.x);
		System.out.println(e.y);

		// Ŭ���� ����
		String[] data = { "��ö��", "qwer", "1234", "1", "30" };
		int number = Integer.parseInt(data[3]);
		System.out.println(number);
		int score = Integer.parseInt(data[4]);
		System.out.println(score);

		//
		Data cData = new Data(); // ������ �Ҵ�
		cData.id = "�̸���";
		cData.pw = "2345";
		cData.id = "asdf";
		cData.number = 2;
		cData.score = 54;

	}

}