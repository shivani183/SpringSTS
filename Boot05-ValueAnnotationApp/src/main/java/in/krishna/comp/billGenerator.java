package in.krishna.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bill")
public class billGenerator {
	
	@Value("#{info.idli+info.dosa+info.vada}")
	private float billAmount;
	
	@Value("Sitara")
	private String hotelNAme;
	
	@Autowired
	private itemInfo info;

	@Override
	public String toString() {
		return "billGenerator [billAmount=" + billAmount + ", hotelNAme=" + hotelNAme + ", info=" + info + "]";
	}

}
