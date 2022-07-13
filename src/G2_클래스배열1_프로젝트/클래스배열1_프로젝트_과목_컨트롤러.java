package G2_클래스배열1_프로젝트;

import java.util.Scanner;

class Student {
	int number;
	String name;
}

class Subject {
	int studentNumber;
	String subject;
	int score;
	int rank;
}

public class 클래스배열1_프로젝트_과목_컨트롤러 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int max = 1000;
		int stSize = max;
		Student[] stList = new Student[stSize];
		for (int i = 0; i < stSize; i++) {
			stList[i] = new Student();
		}

		int subSize = max;
		Subject[] subList = new Subject[subSize];
		for (int i = 0; i < subSize; i++) {
			subList[i] = new Subject();

		}
		int number = 1000;
		int stNum = 0;
		int subNum = 0;
		while (true) {
			System.out.println("[0] 종료 ");
			System.out.println("[1] 학생저장");
			System.out.println("[2] 학생삭제");
			System.out.println("[3] 과목추가");
			System.out.println("[4] 과목삭제");
			System.out.println("[5] 전체출력");

			int sel = scan.nextInt();
			scan.nextLine();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				System.out.print("이름 입력 : ");
				String name = scan.nextLine();
				number++;
				stList[stNum].number = number;
				stList[stNum].name = name;
				stNum++;
			} else if (sel == 2) {
				System.out.println("이름 입력 : ");
				String name = scan.nextLine();
				int num = 0;
				for (int i = 0; i < stNum; i++) {
					if (stList[i].name.equals(name)) {
						num = stList[i].number;
						for (int j = i; j < stNum - 1; j++) {
							stList[j] = stList[j + 1];
						}
						stList[stNum - 1] = null;
						stNum--;
						break;
					}
				}
				int cnt = 0;
				while (true) {
					if (cnt == subNum) {
						break;
					}
					if (subList[cnt].studentNumber == num) {
						for (int j = cnt; j < subNum - 1; j++) {
							subList[j] = subList[j + 1];
						}
						subList[subNum - 1] = null;
						subNum--;
					} else {
						cnt++;
					}
				}

			} else if (sel == 3) {
				System.out.print("번호 입력 : ");
				int num = scan.nextInt();
				boolean check = false;
				for (int i = 0; i < stNum; i++) {
					if (num == stList[i].number) {
						check = true;
					}
				}
				scan.nextLine();
				if (check == true) {
					System.out.print("과목 입력 : ");
					String sub = scan.nextLine();
					System.out.print("점수 입력 : ");
					int score = scan.nextInt();
					subList[subNum].studentNumber = num;
					subList[subNum].subject = sub;
					subList[subNum].score = score;
					subNum++;
				}
				// 번호순으로 정렬
				for (int i = 0; i < subNum; i++) {
					Subject temp = new Subject();
					for (int j = i; j < subNum; j++) {
						if (subList[i].studentNumber > subList[j].studentNumber) {
							temp = subList[i];
							subList[i] = subList[j];
							subList[j] = temp;
						}
					}
				}
				// 랭킹
				for (int i = 0; i < subNum; i++) {
					int rank = 1;
					for (int j = 0; j < subNum; j++) {
						if (subList[i].subject.equals(subList[j].subject)) {
							if (subList[i].score < subList[j].score) {
								rank++;
							}
						}
					}
					subList[i].rank = rank;
				}
			} else if (sel == 4) {
				System.out.print("번호 입력 : ");
				int num = scan.nextInt();
				System.out.println("-------------------------------------");
				for (int i = 0; i < subNum; i++) {
					if (num == subList[i].studentNumber) {
						System.out.printf("[%6d ][%5s ][%6d ][%7d  ]\n", subList[i].studentNumber, subList[i].subject,
								subList[i].score, subList[i].rank);
					}
				}
				scan.nextLine();
				System.out.print("과목 선택 : ");
				String sub = scan.nextLine();
				System.out.print("점수 선택 : ");
				int score = scan.nextInt();
				for (int i = 0; i < subNum; i++) {
					if (subList[i].studentNumber == num) {
						System.out.println("조건성립1");
						System.out.println(subList[i].subject + " " + subList[i].score);
						System.out.println(sub + " " + score);
						if (subList[i].subject.equals(sub) && subList[i].score == score) {
							System.out.println("조건성립2");
							for (int j = i; j < subNum - 1; j++) {
								subList[j] = subList[j + 1];
							}
							subList[subNum - 1] = null;
							subNum--;
						}
					}
				}
			} else if (sel == 5) {
				System.out.println("[  번호  ][   이름   ]");
				for (int i = 0; i < stNum; i++) {
					System.out.printf("[%6d ][%7s ]\n", stList[i].number, stList[i].name);
				}
				System.out.println("-------------------------------------");
				System.out.println("[  번호  ][  과목  ][  점수  ][ 과목별등수 ]");
				for (int i = 0; i < subNum; i++) {
					System.out.printf("[%6d ][%5s ][%6d ][%7d  ]\n", subList[i].studentNumber, subList[i].subject,
							subList[i].score, subList[i].rank);
				}
				System.out.println("-------------------------------------");
			}
		}

	}
}