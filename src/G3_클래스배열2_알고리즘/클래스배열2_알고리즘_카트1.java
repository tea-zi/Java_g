package G3_클래스배열2_알고리즘;

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

public class 클래스배열2_알고리즘_카트1 {
	public static void main(String[] args) {
		// [문제] qwer 이 구입한 아이템 총금액
		String data1 = "qwer/asdf/zxcv";
		String data2 = "새우깡,1200/감자깡,3200/고구마깡,2100";
		String data3 = "qwer,새우깡/qwer,고구마깡/asdf,감자깡/qwer,새우깡/zxcv,새우깡";

		User[] userList;
		Item[] itemList;
		Cart[] cartList;

		// 문자열을 각각의 클래스배열에 저장
		String[] tokens = data1.split("/");
		int userSize = tokens.length;
		userList = new User[userSize];
		for (int i = 0; i < userSize; i++) {
			userList[i] = new User();
			userList[i].id = tokens[i];
		}
		tokens = data2.split("/");
		int itemSize = tokens.length;
		itemList = new Item[itemSize];
		for (int i = 0; i < itemSize; i++) {
			String[] tokens2 = tokens[i].split(",");
			int price = Integer.parseInt(tokens2[1]);
			itemList[i] = new Item();
			itemList[i].name = tokens2[0];
			itemList[i].price = price;
		}

		tokens = data3.split("/");
		int cartSize = tokens.length;
		cartList = new Cart[cartSize];
		for (int i = 0; i < cartSize; i++) {
			cartList[i] = new Cart();

			String[] tokens2 = tokens[i].split(",");
			cartList[i].userId = tokens2[0];
			cartList[i].itemName = tokens2[1];
		}

		int total = 0;
		for (int i = 0; i < cartSize; i++) {
			if (cartList[i].userId.equals("qwer")) {
				for (int j = 0; j < itemSize; j++) {
					if (cartList[i].itemName.equals(itemList[j].name)) {
						total += itemList[j].price;
					}
				}
			}
		}
		System.out.println(total);

	}

}