package stadium.service;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Repository
public class GenericServiceImpl<T> implements GenericService<T> {
    private Class<T> type;

    @PersistenceContext
    private EntityManager entityManager;

    public void setType(Class<T> c){
        this.type=c;
    }

    @Override
    public T getById(int id) throws Exception {
        return entityManager.find(type, id);
    }
}