package study;

public class main {
	/**
	 * Main.java
	 *
	 * 本課題では、mainメソッド・インスタンス・メソッドの呼び出しの使い方を学んでいきましょう。
	 * 課題範囲は以下のとおりです。
	 *   Study.java: 問①
	 *   Main.java: 問①から問②
	 * 指定された値と変数名を守って記述してください。
	 *
	 */

	public static void main(String[] args) {
		// ① 以下のルールに従いAccountクラスのインスタンスを生成してください。
		// 変数名:「account」
		// ② ①のインスタンス変数より、アカウント情報をコンソール出力するメソッドを呼び出しなさい。
		Account account = new Account("hoge", 123, "abc123");
		account.printAccountInfo();
	}
}

