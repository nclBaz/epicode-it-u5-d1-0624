package riccardogulin.u5d1.entities;

public class Interviewer {
	private Student student;

	public Interviewer(Student student) {
		this.student = student;
	}

	public void askQuestion() {
		System.out.println("Ciao " + this.student.getName() + ", per favore rispondi alla seguente domanda...blabblblba");
		this.student.answerQuestion();
	}
}
