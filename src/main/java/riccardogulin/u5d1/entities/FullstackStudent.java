package riccardogulin.u5d1.entities;

public class FullstackStudent extends Student {

	public FullstackStudent(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void answerQuestion() {
		System.out.println("Ciao sono uno studente Fullstack. La risposta alla tua domanda è nkasndlnsaldnlsandl");
	}

	@Override
	public String toString() {
		return "FullstackStudent{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				"} ";
	}
}
