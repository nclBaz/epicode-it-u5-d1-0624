package riccardogulin.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import riccardogulin.u5d1.entities.BackendStudent;
import riccardogulin.u5d1.entities.FrontendStudent;
import riccardogulin.u5d1.entities.Interviewer;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5d1Application.class, args);

		// ------------------------------------------- METODO TRADIZIONALE ---------------------------------------

/*		BackendStudent aldo = new BackendStudent("Aldo", "Baglio");
		Interviewer interviewer = new Interviewer(aldo);

		interviewer.askQuestion();*/

		// ------------------------------------------- METODO CON I BEANS ---------------------------------------

		// Per poter leggere i Bean dallo scatolone devo prima ottenere un riferimento al context, poi tramite quello
		// posso leggere i vari Bean uno per uno, alla fine di tutto sarebbe bene sempre chiudere il context

		// 1. Ottengo un riferimento al context ("Application Context")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5d1Application.class);

		// 2. Leggo i bean dal context tramite .getBean(), questo metodo prevede due modalità principali di lettura o tramite nome del bean
		// o tramite il tipo (classe) del bean
		FrontendStudent fs = context.getBean(FrontendStudent.class); // Tramite tipo
		System.out.println(fs);
		BackendStudent bs = (BackendStudent) context.getBean("getBEStudent"); // Tramite nome. Il nome del Bean è il nome del
		// metodo (della classe di configurazione) se non specificato diversamente
		System.out.println(bs);

		Interviewer i = context.getBean(Interviewer.class);
		i.askQuestion();


		// 3. Chiudo il context
		context.close();

	}

}
