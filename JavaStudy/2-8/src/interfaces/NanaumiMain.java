package interfaces;

public class NanaumiMain {

	public static void main(String[] args) {

		Nanaumi Nanaumi = new Nanaumi("七海", "2020/08");

		Nanaumi.daseyaKinmuhyo();
        Nanaumi.daseyaKotsuhi();
        Nanaumi.doNothing();
        Nanaumi.goToSevenEleven();

        final String mesage = Nanaumi.doCreateJavaCurriculum();
        	System.out.println("message = " + mesage);
	}

}
