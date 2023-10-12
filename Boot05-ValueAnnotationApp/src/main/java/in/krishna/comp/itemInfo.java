package in.krishna.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="info")
public class itemInfo {

	@Value("${item.info.idli}")
	public Float idli;
	
	@Value("${item.info.dosa}")
	public Float dosa;
	
	@Value("${item.info.vada}")
	public Float vada;

	@Override
	public String toString() {
		return "itemInfo [idli=" + idli + ", dosa=" + dosa + ", vada=" + vada + "]";
	}

}
