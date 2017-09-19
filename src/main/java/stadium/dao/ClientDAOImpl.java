package stadium.dao;

import org.springframework.stereotype.Repository;
import stadium.model.Client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Repository
public class ClientDAOImpl implements ClientDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Client getClientByID(int clientId) {
        return entityManager.find(Client.class, clientId);
    }
}
