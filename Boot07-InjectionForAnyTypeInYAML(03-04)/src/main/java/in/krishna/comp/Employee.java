package in.krishna.comp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("emp")
@ConfigurationProperties(prefix = "org.info")
public class Employee {

	private String name;
	private Integer age;
	private String[] skills;
	private List<String> teamMembers;
	private Set<Long> phoneNumber;
	private Map<String,Object> empDetails;
	
	private Company company;
	
	

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setEmpDetails(Map<String, Object> empDetails) {
		this.empDetails = empDetails;
	}

	public void setTeamMembers(List<String> teamMembers) {
		System.out.println("Employee.setTeamMembers()");
		this.teamMembers = teamMembers;
	}

	public void setPhoneNumber(Set<Long> phoneNumber) {
		System.out.println("Employee.setPhoneNumber()");
		this.phoneNumber = phoneNumber;
	}

	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}

	public void setAge(Integer age) {
		System.out.println("Employee.setAge()");
		this.age = age;
	}

	public void setSkills(String[] skills) {
		System.out.println("Employee.setSkills()");
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", skills=" + Arrays.toString(skills) + ", teamMembers="
				+ teamMembers + ", phoneNumber=" + phoneNumber + ", empDetails=" + empDetails + ", company=" + company
				+ "]";
	}


}
