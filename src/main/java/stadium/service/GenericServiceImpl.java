package stadium.service;

import org.springframework.stereotype.Repository;
import stadium.model.Functions;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolationException;

@Transactional
@Repository
public class GenericServiceImpl<T extends Functions> implements GenericService<T> {
    private Class<T> type;

    @PersistenceContext
    protected EntityManager entityManager;

    public void setType(Class<T> c){
        this.type=c;
    }

    public T getById(Long id) throws Exception {
        return entityManager.find(type, id);
    }


    public Long save(T object) throws ConstraintViolationException {
        entityManager.persist(object);
        entityManager.flush();
        return object.getId();
    }

    public void delete(Long id) throws Exception{
        T obj = entityManager.find(type, id);
        entityManager.remove(obj);
    }

    public void patch(T object) throws Exception {
        //TODO
    }
}