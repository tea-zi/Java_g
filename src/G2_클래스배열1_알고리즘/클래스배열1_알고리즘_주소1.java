package G2_Ŭ�����迭1_�˰���;

class AA {
	int a;
	int b;
}

public class Ŭ�����迭1_�˰���_�ּ�1 {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.a = 10;
		aa = new AA();
		aa.b = 20;

		// ������ �����ϱ� [20]
		System.out.println(aa.a + aa.b);
	}
}