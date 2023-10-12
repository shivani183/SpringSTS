package in.krishna.comp;

import org.springframework.stereotype.Component;

@Component(value="company")
public class Company {
	
	public String title;
	
	public String location;
	
	public Integer strength;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "Company [title=" + title + ", location=" + location + ", strength=" + strength + "]";
	}
	

}
