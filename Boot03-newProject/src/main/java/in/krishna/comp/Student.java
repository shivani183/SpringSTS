package in.krishna.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	@Qualifier("python")
	public ICourse course;
	
	static {
		System.out.println("Student.class file is loaded()");
	}
	public Student() {
		System.out.println("Student zero arg constructor");
	}
	public void purchageCourse(String examName) {
		System.out.println("course taken is :"+course.getClass().getName());
		System.out.println(course.courseContent());
		System.out.println("The amount of this course is "+course.Amount());
		System.out.println("THis is the info of course for "+examName);
	}
	

}
