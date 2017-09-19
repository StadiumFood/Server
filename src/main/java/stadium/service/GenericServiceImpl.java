package stadium.service;

import net.sf.json.JSONObject;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import stadium.model.functions;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;

@Transactional
public abstract class GenericServiceImpl<T> implements GenericService<T> {
//    private Class<T> type;
//
//    @Autowired
//    private SessionFactory sessionFactory;
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//    protected SessionFactory getSessionFactory() {
//        if (sessionFactory == null)
//            throw new IllegalStateException("SessionFactory has not been set on DAO before usage");
//        return sessionFactory;
//    }
//
//    public GenericServiceImpl(){
//        this.type=(Class<T>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//    }
//    public Class<T> getType() {
//        return type;
//    }
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public T getById(Integer id) throws Exception {
//        return entityManager.find(type, id);
//    }
}