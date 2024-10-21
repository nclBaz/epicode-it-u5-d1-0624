package riccardogulin.u5d1.entities;

public class FrontendStudent extends Student {
	public FrontendStudent(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void answerQuestion() {
		System.out.println("Ciao sono uno studente Frontend. La risposta alla tua domanda è xcvxcvcxvcxv");
	}

	@Override
	public String toString() {
		return "FrontendStudent{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				"} ";
	}
}
