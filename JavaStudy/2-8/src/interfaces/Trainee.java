package interfaces;

public class Trainee extends JavaCurriculumTrainee {

	public Trainee(String name) {
		super(name);

	}

	@Override
	public void doJavaCurriculum() {
		System.out.println("私、" + super.getName() + "は、Javaカリキュラムをこなします");

	}


}
