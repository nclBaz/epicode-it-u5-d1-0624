package riccardogulin.u5d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Student {

	/*	@Setter(AccessLevel.NONE) // <-- Serve per dirgli di non creare il setter per questo campo
		protected long id;*/
	protected String name;
	protected String surname;

	public abstract void answerQuestion();

}
