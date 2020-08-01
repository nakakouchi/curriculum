package study;

import java.util.ResourceBundle;
public class Test {

	public static void main(String args[]) {
        ResourceBundle bundle = ResourceBundle.getBundle("test");
        String value = bundle.getString("pass");
        System.out.println(value);
    }

}
