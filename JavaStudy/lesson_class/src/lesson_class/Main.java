package lesson_class;


public class Main {

	public static void main(String[] args) {

		Chef meatdish = new Chef("肉料理");
		String meat_dish = meatdish.gril("米沢牛");
		Waiter waiter = new Waiter();
		waiter.sreving(meat_dish);
	}


}
