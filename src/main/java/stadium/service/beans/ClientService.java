package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.Client;
import stadium.service.GenericServiceImpl;


@Service
public class ClientService extends GenericServiceImpl<Client> {
    public ClientService(){
        this.setType(Client.class);
    }
}
