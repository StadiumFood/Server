package stadium.service.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import stadium.model.Client;
import stadium.service.GenericServiceImpl;

@Service
public class ClientBean {
    @Bean
    public GenericServiceImpl<Client> clientGenericService(){
        GenericServiceImpl<Client> genericService = new GenericServiceImpl<>();
        genericService.setType(Client.class);
        return genericService;
    }
}
