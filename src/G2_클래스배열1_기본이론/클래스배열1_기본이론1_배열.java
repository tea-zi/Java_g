package G2_Å¬·¡½º¹è¿­1_±âº»ÀÌ·Ğ;

class Member {
	int number;
	String id;
	String pw;
	String name;
	int score;
}

public class Å¬·¡½º¹è¿­1_±âº»ÀÌ·Ğ1_¹è¿­ {
	public static void main(String[] args) {
		String data1 = "1001/1234/qwer/±èÃ¶¼ö/10";
		String dataList1[] = { "1001", "1234", "qwer", "±èÃ¶¼ö", "10" };

		Member member = new Member();
		member.number = 1001;
		member.id = "qwer";
		member.pw = "1234";
		member.name = "±èÃ¶¼ö";
		member.score = 10;

		// -------------------------------------------------
		String data2 = "";
		data2 += "1001/qwer/1234/±èÃ¶¼ö/10\n";
		data2 += "1002/asdf/2345/ÀÌ¿µÈñ/30";

		String dataList2[][] = { { "1001", "qwer", "1234", "±èÃ¶¼ö", "10" }, { "1002", "asdf", "2345", "ÀÌ¿µÈñ", "30" }, };

		Member[] memberList = new Member[2];
		Member m1 = new Member();
		m1.number = 1001;
		m1.id = "qwer";
		m1.pw = "1234";
		m1.name = "±èÃ¶¼ö";
		m1.score = 10;
		memberList[0] = m1;
		Member m2 = new Member();
		m2.number = 1002;
		m2.id = "asdf";
		m2.pw = "2345";
		m2.name = "ÀÌ¿µÈñ";
		m2.score = 30;
		memberList[1] = m2;
	}
}