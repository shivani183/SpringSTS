package in.krishna;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.krishna.dao.EmployeeImp;
import in.krishna.model.Employee;

@SpringBootApplication
public class Boot03SpringTestAppApplication {

	public static void main(String[] args) throws SQLException {
	ApplicationContext appContext = SpringApplication.run(Boot03SpringTestAppApplication.class, args);
	EmployeeImp imp = appContext.getBean(EmployeeImp.class);
	
	List<Employee> allDetail = imp.getAllDetail();
	
	allDetail.forEach(System.out::println);
	
	((ConfigurableApplicationContext) appContext).close();
	}

}
