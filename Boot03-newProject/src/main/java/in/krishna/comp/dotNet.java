package in.krishna.comp;

import org.springframework.stereotype.Component;

@Component
public class dotNet implements ICourse {

	@Override
	public float Amount() {
		return 3000;
	}

	@Override
	public String courseContent() {
		return "you will learn framework";
	}

}
