package watson.corp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import watson.corp.Model.Students;
import watson.corp.Repository.StudentRepo;


@SpringBootApplication
public class CorpApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CorpApplication.class, args);
	}

	@Autowired
	private StudentRepo studentRepo;
	@Override
	public void run(String... args) throws Exception {
		/*Students students1 = new Students("Francis", "Watson", "Watson@mail.com", 1996);
		studentRepo.save(students1);
		Students students2 = new Students("Victoria", "Watson", "Victoria@mail.com", 1993);
		studentRepo.save(students2);
		Students students3 = new Students("Blessing", "Watson", "Blessing@mail.com", 2000);
		studentRepo.save(students3);*/
		
	}

}
