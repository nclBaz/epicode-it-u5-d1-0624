package riccardogulin.u5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import riccardogulin.u5d1.entities.*;

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

	@Bean(name = "aldo") // Opzionalmente posso specificare un nome custom per il Bean, se non lo faccio verrà usato il nome del metodo
	@Scope("prototype") // Annotazione OPZIONALE. Mi serve quando voglio che lo Scope non sia SINGLETON
	// SINGLETON = c'è un'UNICA COPIA DELL'OGGETTO IN TUTTA L'APPLICAZIONE. Questo è il valore di default dello scope (ed è estremamente utile)
	// PROTOTYPE = ogni volta che uso .getBean() mi verrà restituito un NUOVO OGGETTO scollegato dal precedente
	// Esisto ulteriori opzioni per @Scope, le quali però hanno senso solo nel contesto di applicazioni web
	public FullstackStudent getFSStudent() {
		return new FullstackStudent("Aldo", "Baglio");
	}

	@Bean
	public FrontendStudent getFEStudent() {
		return new FrontendStudent("Giovanni", "Storti");
	}

	@Bean(name = "giacomo")
	@Primary // Annotazione per risolvere le ambiguità. Ogni qualvolta ci sia un dubbio su
	// quale Student scegliere, verrà scelto questo (una sorta di default)
	public BackendStudent getBEStudent(String name) {
		return new BackendStudent(name, "Poretti");
	}

	@Bean
	public Interviewer getInterviewer(Student student) {
		return new Interviewer(student);
	}

}
