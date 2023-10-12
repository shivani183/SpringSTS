package in.krishna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.krishna.comp.billGenerator;

@SpringBootApplication
public class Boot05ValueAnnotationAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot05ValueAnnotationAppApplication.class, args);
		billGenerator bean = context.getBean(billGenerator.class);
		System.out.println(bean);
		((ConfigurableApplicationContext) context).close();
	}

}
