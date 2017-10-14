package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.Type;
import stadium.service.GenericServiceImpl;

@Service
public class TypeService extends GenericServiceImpl<Type> {
    public TypeService(){
        this.setType(Type.class);
    }
}