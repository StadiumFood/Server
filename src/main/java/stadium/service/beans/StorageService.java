package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.Storage;
import stadium.service.GenericServiceImpl;

@Service
public class StorageService extends GenericServiceImpl<Storage> {
    public StorageService(){
        this.setType(Storage.class);
    }
}