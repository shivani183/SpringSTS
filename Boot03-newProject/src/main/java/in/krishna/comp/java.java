package in.krishna.comp;

import org.springframework.stereotype.Component;

@Component(value="java")
public class java implements ICourse {

	@Override
	public float Amount() {
		return 4000;
	}

	@Override
	public String courseContent() {
		
		return "you will learn OOPs, Exception Handling, MultiThreading etc.";
	}

}
