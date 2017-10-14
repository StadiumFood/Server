package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.Sell;
import stadium.service.GenericServiceImpl;

@Service
public class SellService extends GenericServiceImpl<Sell> {
    public SellService(){
        this.setType(Sell.class);
    }
}