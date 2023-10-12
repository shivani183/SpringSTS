package in.krishna.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {

	@Autowired
	public LocalDateTime date;
	
	static {
		System.out.println("WishMessageGenerator.class file is loaded");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");

	}
	
	public String generateMsg(String user) {
		int hour=date.getHour();
		if(hour<4) 
			return "good after noon : "+ user;
		else if(hour<9) 
			return "good evening : "+ user;
		else if(hour<12)
			return "good night : "+ user;
		else
			return "Good Morning : "+ user;
	}
}
