package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.SellEntre;
import stadium.service.GenericServiceImpl;

import javax.persistence.Query;
import java.util.List;

@Service
public class SellEntreService extends GenericServiceImpl<SellEntre> {
    public SellEntreService(){
        this.setType(SellEntre.class);
    }

    public List<SellEntre> getSellEntresBySellId(Long id){
        Query hql = entityManager
                .createQuery("SELECT s FROM SellEntre s WHERE s.sellId = ?1 ORDER BY s.id")
                .setParameter(1,id);
        List<SellEntre> result = (List<SellEntre>) hql.getResultList();
        return  result;
    }
}