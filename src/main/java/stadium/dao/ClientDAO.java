package stadium.dao;

import stadium.model.Client;

public interface ClientDAO {
    Client getClientByID(int clientId);
}
