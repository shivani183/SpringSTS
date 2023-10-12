package in.krishna;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.krishna.comp.WishMessageGenerator;

@SpringBootApplication
public class Boot02DependencyInjectionApplication {
	
	static {
		System.out.println("Boot02DependencyInjectionApplication.class file is loaded");
	}
	public Boot02DependencyInjectionApplication() {
		System.out.println("Boot02DependencyInjectionApplication zero arg constructor");
	}
	
	@Bean
	public LocalDateTime createObj() {
		System.out.println("Boot02DependencyInjectionApplication.createObj()");
		return LocalDateTime.now();
	}

	
	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(Boot02DependencyInjectionApplication.class, args);
		WishMessageGenerator bean = appContext.getBean(WishMessageGenerator.class);
		String msg=bean.generateMsg( "shivani");
		System.out.println(msg);
	}

}
