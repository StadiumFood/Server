package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.EmployeeWorks;
import stadium.service.GenericServiceImpl;

@Service
public class EmployeeWorksService extends GenericServiceImpl<EmployeeWorks> {
    public EmployeeWorksService(){
        this.setType(EmployeeWorks.class);
    }
}