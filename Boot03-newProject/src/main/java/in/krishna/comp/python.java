package in.krishna.comp;

import org.springframework.stereotype.Component;

@Component
public class python implements ICourse {

	@Override
	public float Amount() {
		return 5000;
	}

	@Override
	public String courseContent() {
		return "you will learn datatypes, Exception Handling, object etc.";
	}

}
