package G3_Ŭ�����迭2_������Ʈ;

import java.util.Scanner;

class User {
	String id;
}

class Item {
	String name;
	int price;
}

class Cart {
	String userId;
	String itemName;
}

public class Ŭ�����迭2_������Ʈ_������_��Ʈ�ѷ� {
	public static void main(String[] args) {
		String[] userIdList = { "admin", "bbb", "ccc" };

		String[] itemNameList = { "���", "ĭ��", "��", "��" };
		int[] itemPriceList = { 10000, 2000, 6500, 3300 };

		int max = 1000;
		User[] userList = new User[max];
		int userSize = 0;
		for (int i = 0; i < userIdList.length; i++) {
			userList[i] = new User();
			userList[i].id = userIdList[i];
			userSize += 1;
		}

		Item[] itemList = new Item[max];
		int itemSize = 0;
		for (int i = 0; i < itemNameList.length; i++) {
			itemList[i] = new Item();
			itemList[i].name = itemNameList[i];
			itemList[i].price = itemPriceList[i];
			itemSize += 1;
		}

		Cart[] cartList = new Cart[max];
		int cartSize = 0;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("[0] ���� [1] �α��� [2] ȸ������ ");
			int sel = scan.nextInt();
			scan.nextLine();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				System.out.println("[�α���] ���̵� �Է� : ");
				String id = scan.next();

				boolean idCheck = false;
				for (int i = 0; i < userSize; i++) {
					if (id.equals(userList[i].id)) {
						idCheck = true;
					}
				}

				if (idCheck == false) {
					System.out.println("[�α��ν���]");
					continue;
				}

				if (id.equals("admin")) {
					while (true) {
						System.out.println("[�����ڸ޴�]");
						System.out.println("[0] �α׾ƿ� [1] ������ �߰� [2] ������ ����");
						sel = scan.nextInt();
						scan.nextLine();
						if (sel == 0) {
							break;
						} else if (sel == 1) { // item add
							System.out.print("item : ");
							String item = scan.nextLine();
							boolean check = false;
							for (int i = 0; i < itemSize; i++) {
								if (itemList[i].name.equals(item)) {
									check = true;
								}
							}
							if (check == false) {
								itemList[itemSize] = new Item();
								itemList[itemSize].name = item;
								System.out.print("Price : ");
								int price = scan.nextInt();
								itemList[itemSize].price = price;
								itemSize++;
							}
						} else if (sel == 2) { // item delete
							System.out.print("item : ");
							String item = scan.nextLine();
							for (int i = 0; i < itemSize; i++) {
								if (itemList[i].name.equals(item)) {
									for (int j = i; j < itemSize - 1; j++) {
										itemList[j] = itemList[j + 1];
									}
									itemList[itemSize - 1] = null;
									itemSize--;
								}
							}
						} else if (sel == 3) {
							for (int i = 0; i < itemSize; i++) {
								System.out.println(itemList[i].name + " / " + itemList[i].price);
							}
						}
					}

				} else {
					while (true) {
						System.out.println("[" + id + " �α���]");
						System.out.println("[���θ޴�]");
						for (int i = 0; i < itemSize; i++) {
							System.out.printf("[%5s : %5d]\n", itemList[i].name, itemList[i].price);
						}
						System.out.println("[0] �α׾ƿ� [1] ���� [2] �ֹ�Ȯ�� [3] Ż��");
						sel = scan.nextInt();
						scan.nextLine();
						if (sel == 0) {
							break;
						} else if (sel == 1) { // ����
							System.out.print("��ǰ : ");
							String item = scan.nextLine();
							boolean check = false;
							for (int i = 0; i < itemSize; i++) {
								if (itemList[i].name.equals(item)) {
									check = true;
								}
							}
							if (check == true) {
								cartList[cartSize] = new Cart();
								cartList[cartSize].userId = id;
								cartList[cartSize].itemName = item;
								cartSize++;
							} else {
								System.out.println("��ġ�ϴ� ��ǰ�� �����ϴ�.");
							}
						} else if (sel == 2) { // �ֹ�Ȯ��
							int sum = 0;
							for (int i = 0; i < cartSize; i++) {
								if (cartList[i].userId.equals(id)) {
									System.out.printf("[%5s]\n", cartList[i].itemName);
									for (int j = 0; j < itemSize; j++) {
										if (cartList[i].itemName.equals(itemList[j].name)) {
											sum += itemList[j].price;
										}
									}
								}
							}
							System.out.println("�� �ֹ��ݾ� : " + sum);
						} else if (sel == 3) { // Ż��
							boolean check = false;
							int idx = 0;
							for (int i = 0; i < userSize; i++) {
								if (userList[i].id.equals(id)) {
									check = true;
									idx = i;
								}
							}
							if (check == true) {
								for (int j = idx; j < userSize - 1; j++) {
									userList[j] = userList[j + 1];
								}
								userList[userSize - 1] = null;
								userSize--;

								int cnt = 0;
								while (true) {
									if (cnt == cartSize) {
										break;
									}
									if (cartList[cnt].userId.equals(id)) {
										for (int i = cnt; i < cartSize - 1; i++) {
											cartList[i] = cartList[i + 1];
										}
										cartList[cartSize - 1] = null;
										cartSize--;
									} else {
										cnt++;
									}
								}
								break;
							}
						}
					}
				}
			} else if (sel == 2) {
				System.out.print("id : ");
				String id = scan.nextLine();
				boolean check = false;
				for (int i = 0; i < userSize; i++) {
					if (userList[i].id.equals(id)) {
						check = true;
					}
				}
				if (check == false) {
					userList[userSize] = new User();
					userList[userSize].id = id;
					userSize++;
				}
			} else if (sel == 3) {
				System.out.println("\n---------------------------");
				for (int i = 0; i < userSize; i++) {
					System.out.print(userList[i].id + " / ");
				}
				System.out.println("\n---------------------------");
				for (int i = 0; i < cartSize; i++) {
					System.out.printf("[%5s : %5s]\n", cartList[i].userId, cartList[i].itemName);
				}
				System.out.println("\n---------------------------");
			}

		}

	}
}