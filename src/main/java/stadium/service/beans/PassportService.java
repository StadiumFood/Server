package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.Passport;
import stadium.service.GenericServiceImpl;

@Service
public class PassportService extends GenericServiceImpl<Passport> {
    public PassportService(){
        this.setType(Passport.class);
    }
}