package G2_Ŭ�����迭1_�˰���;

import java.util.Arrays;
import java.util.Scanner;

/*
class Student{
	int number;
	String name;
}

class Subject{
	int studentNumber;
	String subject;
	int score;
	int rank;
}
 */
public class Ŭ�����迭1_�˰���_����2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String studentSample = "1001/�̸���\n";
		studentSample += "1002/��ö��\n";
		studentSample += "1003/������\n";

		String subjectSample = "";
		subjectSample += "1001/����/100/0\n";
		subjectSample += "1001/����/32/0\n";
		subjectSample += "1002/����/23/0\n";
		subjectSample += "1002/����/35/0\n";
		subjectSample += "1002/����/46/0\n";
		subjectSample += "1003/����/60/0";

		// ����1) �� ���ù��ڿ����� ���� �ش� Ŭ�����迭�� ������ ���
		Student stlist[] = null;
		int stsize = 0;
		Subject sublist[] = null;
		int subsize = 0;
		String to[] = studentSample.split("\n");
		stsize = to.length;
		stlist = new Student[stsize];
		for (int i = 0; i < stsize; i++) {
			String to2[] = to[i].split("/");
			stlist[i] = new Student();
			stlist[i].name = to2[1];
			stlist[i].number = Integer.parseInt(to2[0]);
		}
		for (int i = 0; i < stsize; i++) {
			System.out.println(stlist[i].number + " / " + stlist[i].name);
		}
		to = subjectSample.split("\n");
		subsize = to.length;
		sublist = new Subject[subsize];
		for (int i = 0; i < subsize; i++) {
			String to2[] = to[i].split("/");
			sublist[i] = new Subject();
			sublist[i].studentNumber = Integer.parseInt(to2[0]);
			sublist[i].subject = to2[1];
			sublist[i].score = Integer.parseInt(to2[2]);
			sublist[i].rank = Integer.parseInt(to2[3]);
		}
		for (int i = 0; i < subsize; i++) {
			System.out.println(sublist[i].studentNumber + " / " + sublist[i].subject + " / " + sublist[i].score + " / "
					+ sublist[i].rank);
		}
		// ����1) ������ 59�������� ������ ���� ������ �ٽ� ���ڿ��� ������ ���
		subjectSample = "";
		for (int i = 0; i < subsize; i++) {
			if (sublist[i].score >= 60) {
				subjectSample += sublist[i].studentNumber;
				subjectSample += "/";
				subjectSample += sublist[i].subject;
				subjectSample += "/";
				subjectSample += sublist[i].score;
				subjectSample += "/";
				subjectSample += sublist[i].rank;
				subjectSample += "\n";
			}
		}
		System.out.println(subjectSample);
		subjectSample = "";
		int n = 0;
		while (true) {
			if (n == subsize) {
				break;
			}
			if (sublist[n].score < 60) {
				for (int i = n; i < subsize - 1; i++) {
					sublist[i] = sublist[i + 1];
				}
				sublist[subsize - 1] = null;
				subsize--;
			} else {
				n++;
			}
		}
		for (int i = 0; i < subsize; i++) {
			subjectSample += sublist[i].studentNumber;
			subjectSample += "/";
			subjectSample += sublist[i].subject;
			subjectSample += "/";
			subjectSample += sublist[i].score;
			subjectSample += "/";
			subjectSample += sublist[i].rank;
			subjectSample += "\n";
			System.out.println(sublist[i].studentNumber + " / " + sublist[i].subject + " / " + sublist[i].score + " / "
					+ sublist[i].rank);
		}
		System.out.println(subjectSample);
	}
}