package stadium.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stadium.dao.ClientDAO;
import stadium.model.Client;

@Service("clientService")
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientDAO clientDAO;

    @Override
    public Client getClientById(int clientId) {
        return clientDAO.getClientByID(clientId);
    }
}
