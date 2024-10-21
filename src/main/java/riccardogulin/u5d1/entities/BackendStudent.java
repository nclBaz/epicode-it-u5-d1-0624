package riccardogulin.u5d1.entities;

public class BackendStudent extends Student {
	public BackendStudent(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void answerQuestion() {
		System.out.println("Ciao sono uno studente Backend. La risposta alla tua domanda è asdasdasdsad");
	}

	@Override
	public String toString() {
		return "BackendStudent{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				"} ";
	}
}
