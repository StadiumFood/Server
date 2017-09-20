package stadium.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stadium.dto.ResponseDTO;
import stadium.model.Client;

@Service
public class ControllerService {

    @Autowired
    GenericServiceImpl<Client> clientGenericService;

    public ResponseDTO getClientById(int id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Client temp = clientGenericService.getById(id);
        dto.setData(temp.getMap());
        return dto;
    }

}
