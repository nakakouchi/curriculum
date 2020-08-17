package interfaces;

public class Nanaumi implements OrderFromMotoki, OrderFromShihandai {

	private String name;
	private String date;

	public Nanaumi(String n, String yyyyMM) {
		name = n;
		date = yyyyMM;
	}

	private void submitOrder(final int shoriFlg) {
		String nameAnd = name + "、";
		if (shoriFlg == 0) {
			System.out.println(nameAnd + date + "の出勤表を出しました");
		} else if (shoriFlg == 1) {
			System.out.println(nameAnd + date + "の交通費も出しました");
		} else {
			System.out.println(nameAnd + "ホントはまだ出してません");
		}
	}

	public void doNothing() {
		submitOrder(-1);
	}


	public void daseyaKinmuhyo() {
		submitOrder(0);

	}


	public void daseyaKotsuhi() {
		submitOrder(1);

	}


	public void goToSevenEleven() {
		System.out.println("先にセブンイレブンに行ってきます");

	}

	public String doCreateJavaCurriculum() {
		return "Javaカリキュラム完成";
	}

}
