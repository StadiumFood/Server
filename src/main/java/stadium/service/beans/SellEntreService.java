package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.SellEntre;
import stadium.service.GenericServiceImpl;

@Service
public class SellEntreService extends GenericServiceImpl<SellEntre> {
    public SellEntreService(){
        this.setType(SellEntre.class);
    }
}