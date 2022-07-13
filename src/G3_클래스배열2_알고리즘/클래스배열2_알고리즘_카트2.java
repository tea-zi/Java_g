package G3_클래스배열2_알고리즘;

import java.util.Scanner;
/*
class User{
	String id;
}
class Item{
	String name;
	int price;
}
class Cart{
	String userId;
	String itemName;
}*/

public class 클래스배열2_알고리즘_카트2 {
	public static void main(String[] args) {
		String[] userIdList = { "aaa", "bbb", "ccc" };

		String[] itemNameList = { "사과", "칸초", "귤", "감" };
		int[] itemPriceList = { 10000, 2000, 6500, 3300 };

		String[] cartUserIdList = { "aaa", "ccc", "aaa", "bbb", "aaa", "ccc" };
		String[] cartItemNameList = { "칸초", "귤", "칸초", "사과", "감", "사과" };

		User[] userList = new User[userIdList.length];
		for (int i = 0; i < userList.length; i++) {
			userList[i] = new User();
			userList[i].id = userIdList[i];
		}

		Item[] itemList = new Item[itemNameList.length];
		for (int i = 0; i < itemList.length; i++) {
			itemList[i] = new Item();
			itemList[i].name = itemNameList[i];
			itemList[i].price = itemPriceList[i];
		}

		Cart[] cartList = new Cart[cartUserIdList.length];
		for (int i = 0; i < cartList.length; i++) {
			cartList[i] = new Cart();
			cartList[i].userId = cartUserIdList[i];
			cartList[i].itemName = cartItemNameList[i];
		}

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("[0] 종료\n" + "[1] 전체출력\n" + "[2] 회원 aaa가 주문한 각 아이템이름과 가격들을 출력 \n"
					+ "[3] 카트내용을 전부출력(회원 별 아이템 전체와 아이템 가격을 출력)\n" + "[4] 주문한 아이템 갯수가 가장많은 회원출력\n"
					+ "[5] 주문한 아이템 총액이 가장큰 회원출력");
			int sel = scan.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				System.out.println("---------------------");
				System.out.print("user id : ");
				for (int i = 0; i < userList.length; i++) {
					System.out.print(userList[i].id + " / ");
				}
				System.out.println("\n---------------------");
				System.out.println("[ItemName][ Price ]");
				for (int i = 0; i < itemList.length; i++) {
					System.out.printf("[%7s][%7d]\n", itemList[i].name, itemList[i].price);
				}
				System.out.println("---------------------");
				System.out.println("[UserId][ItemName]");
				for (int i = 0; i < cartList.length; i++) {
					System.out.printf("[%5s][%7s]\n", cartList[i].userId, cartList[i].itemName);
				}
				System.out.println("---------------------");
			} else if (sel == 2) {
				String user = "aaa";
				System.out.printf("==== %5s CartList ====\n", user);
				for (int i = 0; i < cartList.length; i++) {
					if (cartList[i].userId.equals(user)) {
						for (int j = 0; j < itemList.length; j++) {
							if (cartList[i].itemName.equals(itemList[j].name)) {
								System.out.printf("[%5s] : %5d\n", itemList[j].name, itemList[j].price);
							}
						}
					}
				}
			} else if (sel == 3) {
				System.out.println("==== CartList ====");
				for (int i = 0; i < cartList.length; i++) {
					System.out.printf("[%5s]", cartList[i].userId);
					for (int j = 0; j < itemList.length; j++) {
						if (cartList[i].itemName.equals(itemList[j].name)) {
							System.out.printf("[%5s : %5d]\n", itemList[j].name, itemList[j].price);
						}
					}
				}
			} else if (sel == 4) {
				int max = 0;
				String user = "";
				for (int i = 0; i < userList.length; i++) {
					int count = 0;
					for (int j = 0; j < cartList.length; j++) {
						if (userList[i].id.equals(cartList[j].userId)) {
							count++;
						}
					}
					if (max < count) {
						max = count;
						user = userList[i].id;
					}
				}
				System.out.println("주문수가 가장많은 회원 : " + user);
			} else if (sel == 5) {
				int max = 0;
				String user = "";
				for (int i = 0; i < userList.length; i++) {
					int sum = 0;
					for (int j = 0; j < cartList.length; j++) {
						if (userList[i].id.equals(cartList[j].userId)) {
							for (int k = 0; k < itemList.length; k++) {
								if (cartList[j].itemName.equals(itemList[k].name)) {
									sum += itemList[k].price;
								}
							}
						}
					}
					if (max < sum) {
						max = sum;
						user = userList[i].id;
					}
				}
				System.out.println("주문금액이 가장큰 회원 : " + user);
			}
		}

	}
}