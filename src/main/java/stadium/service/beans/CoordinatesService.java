package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.Coordinates;
import stadium.service.GenericServiceImpl;

@Service
public class CoordinatesService extends GenericServiceImpl<Coordinates> {
    public CoordinatesService(){
        this.setType(Coordinates.class);
    }
}
