package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.Sell;
import stadium.service.GenericServiceImpl;

import javax.persistence.Query;
import java.util.List;

@Service
public class SellService extends GenericServiceImpl<Sell> {
    public SellService(){
        this.setType(Sell.class);
    }

    public List<Sell> getSellsByClientId(Long id){
        Query hql = entityManager
                .createQuery("SELECT s FROM Sell s WHERE s.clientId = ?1 ORDER BY s.id")
                .setParameter(1,id);
        List<Sell> result = (List<Sell>) hql.getResultList();
        return  result;
    }
}