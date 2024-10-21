package riccardogulin.u5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import riccardogulin.u5d1.entities.BackendStudent;
import riccardogulin.u5d1.entities.FrontendStudent;
import riccardogulin.u5d1.entities.FullstackStudent;
import riccardogulin.u5d1.entities.Interviewer;

@Configuration // Annotazione OBBLIGATORIA se vogliamo che questa classe venga presa in considerazione all'avvio dell'applicazione
public class StudentsConfig {
	// In pratica questa classe sarà un elenco di BEANS e delle "istruzioni" su come crearli. Ogni Bean è un oggetto gestito non da noi
	// ma da Spring.
	// Per poter creare un Bean dovrò aggiungere un metodo a questa classe che mi restituisca un oggetto di tale tipo

	@Bean // Annotazione OBBLIGATORIA se voglio che il seguente metodo crei un Bean
	// Questi oggetti (e primitivi) faranno quindi parte del cosiddetto Application Context ("scatolone") fin dall'avvio dell'applicazione (se
	// non ci sono errori). Spring in pratica quando avviamo l'applicazione, fa un check se esistano classi di configurazione come questa, poi
	// per ogni @Bean che trova cercherà di aggiungere tale Bean allo scatolone.
	// All'interno di ognuno di questi metodi inseriremo le "istruzioni" su come debbano essere creati/configurati questi oggetti.
	// Quindi, se tutto è stato fatto in maniera corretta, all'avvio mi ritroverò uno scatolone già contenente una serie di oggetti pronti all'uso
	// Spring oltre a ciò è anche in grado di creare oggetti a RUNTIME, non solo all'avvio ma anche durante l'esecuzione (questo aspetto però lo
	// verificheremo più avanti)
	public int getAge() {
		return 20;
	}

	@Bean
	public String getName() {
		return "Ajeje";
	}

	@Bean
	public FullstackStudent getFSStudent() {
		return new FullstackStudent("Aldo", "Baglio");
	}

	@Bean
	public FrontendStudent getFEStudent() {
		return new FrontendStudent("Giovanni", "Storti");
	}

	@Bean
	public BackendStudent getBEStudent() {
		return new BackendStudent("Giacomo", "Poretti");
	}

	@Bean
	public Interviewer getInterviewer(BackendStudent student) {
		return new Interviewer(student);
	}

}
