package in.krishna;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.krishna.comp.Employee;


@SpringBootApplication
public class Boot05ValueAnnotationAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot05ValueAnnotationAppApplication.class, args);
		
		Employee bean = context.getBean(Employee.class);
		
		System.out.println(bean);
		((ConfigurableApplicationContext) context).close();
	}

}
