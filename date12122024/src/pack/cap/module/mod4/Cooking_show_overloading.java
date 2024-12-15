package pack.cap.module.mod4;

class Chef{
	public void cookDish(String dishname) {
		System.out.println("The chef is cooking a delicious " + dishname + " without spices");
	}
	
	public void cookDish(String dishname, String spice) {
		System.out.println("The chef is cooking a delicious " + dishname + " with " + spice);
	}
	
	public void cookDish(String dishname, String spice, int cookingTime) {
		System.out.println("The chef is cooking a spicy " + dishname + " with " + spice +" it will take "+ cookingTime + "to cook");;
	}
	
	public void cookDish(String dishname, int cookingTime) {
		System.out.println("The chef is cooking a " + dishname + " for " + cookingTime);
	}
}


public class Cooking_show_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chef chef = new Chef();
		chef.cookDish("Pasta");
		chef.cookDish("noodles", "oregano");
		chef.cookDish("noodles", "red chilli", 20);
		chef.cookDish("pasta", 30);
	}

}
