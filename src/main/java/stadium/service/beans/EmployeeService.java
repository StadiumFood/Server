package stadium.service.beans;

import org.springframework.stereotype.Service;
import stadium.model.Employee;
import stadium.service.GenericServiceImpl;

@Service
public class EmployeeService extends GenericServiceImpl<Employee> {
    public EmployeeService(){
        this.setType(Employee.class);
    }
}