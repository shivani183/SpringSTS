package in.krishna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.krishna.comp.Student;

@SpringBootApplication
public class Boot03NewProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(Boot03NewProjectApplication.class, args);
		Student std = appContext.getBean(Student.class);
		std.purchageCourse("pyhton");
	}
	
	

}
