package stadium.service;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stadium.dto.ResponseDTO;
import stadium.model.Client;

import javax.validation.ConstraintViolationException;

@Service
public class ControllerService {

    @Autowired
    GenericServiceImpl<Client> clientGenericService;

    public ResponseDTO getClientById(Long id) throws Exception {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Client temp = clientGenericService.getById(id);
        if(temp==null)
            throw new NotFoundException("Client with given id not found");
        dto.setData(temp.getMap());
        return dto;
    }

    public ResponseDTO saveSingleClient(Client client) throws ConstraintViolationException {
        ResponseDTO dto = ResponseDTO.allIsOk();
        Long id = clientGenericService.saveSingleObject(client);
        dto.setMessage(id.toString());
        return dto;
    }

}
