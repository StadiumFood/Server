package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.EmployeeWorks;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class EmployeeWorksController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/employeeWorks/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getEmployeeWorksById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/employeeWorks")
    public ResponseEntity save(@RequestBody EmployeeWorks employeeWorks) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSingleEmployeeWorks(employeeWorks), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/employeeWorks/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSingleEmployeeWorks(id), HttpStatus.OK);
    }
}