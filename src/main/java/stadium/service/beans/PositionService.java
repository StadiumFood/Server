package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.Position;
import stadium.service.GenericServiceImpl;

@Service
public class PositionService extends GenericServiceImpl<Position> {
    public PositionService(){
        this.setType(Position.class);
    }
}