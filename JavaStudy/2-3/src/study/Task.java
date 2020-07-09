package study;

//① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator {
/**
 * タスクの実行
 */
	public void doTask() {
	    // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
	    // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。

		int plus1 = Calculator.plus(10);
		System.out.println("plusメソットの引数が一つの場合：" + plus1);

		int plus2 = Calculator.plus(15,15);
		System.out.println("plusメソットの引数が二つの場合：" + plus2);

		int plus3 = Calculator.plus(20,20,20);
		System.out.println("plusメソットの引数が三つの場合：" + plus3);
	}
}
