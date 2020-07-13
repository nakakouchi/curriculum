package check;

import constants.Constants;


public class Check {

	private static String firstName = "中河内";
	private static String lastName = "涼";

	private static void printName() {
		System.out.println("printNameメソッド → " + firstName + lastName);
	}

	public static void main(String[] args) {
		printName();
		Pet pet1 = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet1.introduce();
		RobotPet pet2 = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		pet2.introduce();
	}

}
