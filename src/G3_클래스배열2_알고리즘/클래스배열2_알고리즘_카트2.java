package G3_Ŭ�����迭2_�˰���;

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

public class Ŭ�����迭2_�˰���_īƮ2 {
	public static void main(String[] args) {
		String[] userIdList = { "aaa", "bbb", "ccc" };

		String[] itemNameList = { "���", "ĭ��", "��", "��" };
		int[] itemPriceList = { 10000, 2000, 6500, 3300 };

		String[] cartUserIdList = { "aaa", "ccc", "aaa", "bbb", "aaa", "ccc" };
		String[] cartItemNameList = { "ĭ��", "��", "ĭ��", "���", "��", "���" };

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
			System.out.println("[0] ����\n" + "[1] ��ü���\n" + "[2] ȸ�� aaa�� �ֹ��� �� �������̸��� ���ݵ��� ��� \n"
					+ "[3] īƮ������ �������(ȸ�� �� ������ ��ü�� ������ ������ ���)\n" + "[4] �ֹ��� ������ ������ ���帹�� ȸ�����\n"
					+ "[5] �ֹ��� ������ �Ѿ��� ����ū ȸ�����");
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
				System.out.println("�ֹ����� ���帹�� ȸ�� : " + user);
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
				System.out.println("�ֹ��ݾ��� ����ū ȸ�� : " + user);
			}
		}

	}
}