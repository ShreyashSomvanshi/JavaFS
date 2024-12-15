package pack.cap.module3.ctrlstmnt;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalBill = 0;
		System.out.println("Welcome to Hotel Paramount! Here is the menu: ");
		System.out.println("\n 1. Starter");
		System.out.println("2. Indian Veg and Non veg");
		System.out.println("3. Chinese");
		System.out.println("4. Thai");
		System.out.println("Choose a category(1-4) ");
		int category = sc.nextInt();
		switch (category) {
		case 1:
			System.out.println("Choose Starter");
			System.out.println("1. Soup 5$");
			System.out.println("2. Sprint rolls 6$");
			System.out.println("3. Paneer tikka 7$");
			System.out.println("Select a dish(1-3)");
			int starter =sc.nextInt();
			switch(starter) {
			case 1: totalBill += 5; break;
			case 2: totalBill += 6; break;
			case 3: totalBill += 7; break;
			default: System.out.println("Invalid choice..");
			}
			break;
			
		case 2: 
			System.out.println("Choose a type: ");
			System.out.println("1. Veg");
			System.out.println("2. Non- veg");
			System.out.println("Select veg or non veg(1-2): ");
			int type = sc.nextInt();
			switch(type) {
			case 1:
				System.out.println("Choose a veg dish: ");
				System.out.println("1. Paneer butter massala 12$ ");
				System.out.println("2. Dal tadka 8$");
				System.out.println("3. Aloo gobhi 7$");
				System.out.println("Select a dish(1-3) ");
				int vegDish = sc.nextInt();
				switch(vegDish) {
				case 1: totalBill += 12; break;
				case 2: totalBill += 8; break;
				case 3: totalBill += 7; break;
				default: System.out.println("Invalid choice..");
				}
				break;
			case 2:
				System.out.println("Choose a Nonveg dish: ");
				System.out.println("1. Chicken butter massala 12$ ");
				System.out.println("2. Mutton 8$");
				System.out.println("3. Fish fry 7$");
				System.out.println("Select a dish(1-3) ");
				int NonvegDish = sc.nextInt();
				switch(NonvegDish) {
				case 1: totalBill += 12; break;
				case 2: totalBill += 8; break;
				case 3: totalBill += 7; break;
				default: System.out.println("Invalid choice..");
				}
				break;
				default: System.out.println("Invalid choice for indian dishes ");
			}
			break;
		
		case 3: 
			System.out.println("Choose a Chinese dish: ");
			System.out.println("1. Fried rice 10$");
			System.out.println("2. Manchurian 20$");
			System.out.println("3. Hakka noodles 15$");
			System.out.println("Select a dish(1-3): ");
			int ChineseDish = sc.nextInt();
			switch(ChineseDish) {
			case 1: totalBill += 10; break;
			case 2: totalBill += 20; break;
			case 3: totalBill += 15; break;
			default: System.out.println("Invalid choice..");
			}
			break;
			
		case 4: 
			System.out.println("Choose a thai dish: ");
			System.out.println("1. Pad thai 10$");
			System.out.println("2. thai green curry 15$");
			System.out.println("3.Tom yum soup 12$");
			System.out.println("Select a dish(1-3): ");
			int thaiDish = sc.nextInt();
			switch(thaiDish) {
			case 1: totalBill += 10; break;
			case 2: totalBill += 15; break;
			case 3: totalBill += 12; break;
			default: System.out.println("Invalid choice..");
			}
			break;
			
		case 5: 
			System.out.println("Choose a Continental dish: ");
			System.out.println("1. frilled chicken 13$");
			System.out.println("2. Pasta 14$");
			System.out.println("3. Caesar salad 12$");
			System.out.println("Select a dish(1-3): ");
			int contDish = sc.nextInt();
			switch(contDish) {
			case 1: totalBill += 13; break;
			case 2: totalBill += 14; break;
			case 3: totalBill += 12; break;
			default: System.out.println("Invalid choice..");
			}
			break;
			
		}
		System.out.println("\n Total Bill: $"+totalBill);
		sc.close();
	}

}
