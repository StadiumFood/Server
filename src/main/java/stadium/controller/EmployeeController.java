package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.Employee;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class EmployeeController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/employee/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getEmployeeById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/employee")
    public ResponseEntity save(@RequestBody Employee employee) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSingleEmployee(employee), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/employee/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSingleEmployee(id), HttpStatus.OK);
    }
}