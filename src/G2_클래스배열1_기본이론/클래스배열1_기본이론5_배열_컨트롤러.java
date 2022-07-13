package G2_클래스배열1_기본이론;

import java.util.Scanner;

/*
class Member{
	int number; String id; String pw; String name; int score;
}
 */
public class 클래스배열1_기본이론5_배열_컨트롤러 {
	public static void main(String[] args) {

		int max = 100;
		Member[] memberList = new Member[max];

		// 클래스배열을 이용해서 crud 구현
		int size = 0;
		int num = 1000; // 번호를 1000부터 시작
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("[1]가입 [2]탈퇴 [3]수정 [4]검색 [5] 전체출력 [0]종료");

			int sel = scan.nextInt();
			scan.nextLine();
			if (sel == 1) {
				Member member = new Member();
				member.number = num;
				num += 1;
				System.out.println("아이디 : ");
				member.id = scan.next();
				System.out.println("비밀번호 : ");
				member.pw = scan.next();
				System.out.println("이름 : ");
				member.name = scan.next();
				System.out.println("점수 : ");
				member.score = scan.nextInt();
				memberList[size] = member;
				size += 1;
			} else if (sel == 2) {
				System.out.print("아이디 입력 : ");
				String id = scan.nextLine();
				int idx = -1;
				for (int i = 0; i < size; i++) {
					if (memberList[i].id.equals(id)) {
						idx = i;
					}
				}
				if (idx == -1) {
					System.out.println("id 없음");
				} else {
					for (int i = idx; i < size - 1; i++) {
						memberList[i] = memberList[i + 1];
					}
					memberList[size - 1] = null;
					size--;
				}
			} else if (sel == 3) {
				while (true) {
					System.out.print("아이디 : ");
					String id = scan.nextLine();
					int idx = 0;
					boolean check = true;
					for (int i = 0; i < size; i++) {
						if (memberList[i].id.equals(id)) {
							idx = i;
							check = false;
							break;
						}
					}
					if (check == true) {
						System.out.println("잘못된 정보입니다.");
						break;
					}
					System.out.println("변경사항을 선택하세요.");
					System.out.print("[1.id][2.pw][3.이름][4.점수][0.뒤로가기]");
					sel = scan.nextInt();
					scan.nextLine();
					if (sel == 1) {
						System.out.print("아이디 입력 : ");
						id = scan.nextLine();
						for (int i = 0; i < size; i++) {
							if (memberList[i].id.equals(id)) {
								System.out.println("동일한 아이디 존재");
								check = true;
								break;
							}
						}
						if (check == false) {
							memberList[idx].id = id;
						} else {
							continue;
						}
					} else if (sel == 2) {
						System.out.print("비밀번호 입력 : ");
						String pw = scan.nextLine();
						for (int i = 0; i < size; i++) {
							if (memberList[i].pw.equals(pw)) {
								System.out.println("사용할 수 없는 비밀번호입니다.");
								check = true;
								break;
							}
						}
						if (check == false) {
							memberList[idx].pw = pw;
						} else {
							continue;
						}
					} else if (sel == 3) {
						System.out.print("이름 입력 : ");
						String name = scan.nextLine();
						memberList[idx].name = name;
					} else if (sel == 4) {
						System.out.print("점수 입력 : ");
						int score = scan.nextInt();
						memberList[idx].score = score;
					} else if (sel == 0) {
						break;
					}

				}
			} else if (sel == 4) {
				System.out.print("[1.id][2.이름][3.점수][0.뒤로가기]");
				sel = scan.nextInt();
				System.out.print("검색 : ");
				scan.nextLine();
				if (sel == 1) {
					String id = scan.nextLine();
					for (int i = 0; i < size; i++) {
						if (memberList[i].id.equals(id)) {
							System.out.println(
									memberList[i].id + " , " + memberList[i].name + ", " + memberList[i].score);
						}
					}
				} else if (sel == 2) {
					String name = scan.nextLine();
					for (int i = 0; i < size; i++) {
						if (memberList[i].name.equals(name)) {
							System.out.println(
									memberList[i].id + " , " + memberList[i].name + ", " + memberList[i].score);
						}
					}
				} else if (sel == 3) {
					int score = scan.nextInt();
					for (int i = 0; i < size; i++) {
						if (memberList[i].score == score) {
							System.out.println(
									memberList[i].id + " , " + memberList[i].name + ", " + memberList[i].score);
						}
					}
				} else if (sel == 0) {
					break;
				}

			} else if (sel == 5) {
				for (int i = 0; i < size; i++) {
					System.out.println(memberList[i].number + " " + memberList[i].id);
				}
			} else if (sel == 0) {
				break;
			}
		}
	}
}