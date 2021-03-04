package lesson_class;

public class Chef {
	public String specialized_field;

	public Chef (String specialized_field_data) {
		this.specialized_field=specialized_field_data;
	}

	public String gril (String ingredients) {
		return ingredients + "のグリル";
	}
}
