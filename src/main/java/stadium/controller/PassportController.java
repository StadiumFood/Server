package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.Passport;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class PassportController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/passport/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getPassportById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/passport")
    public ResponseEntity save(@RequestBody Passport passport) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSinglePassport(passport), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/passport/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSinglePassport(id), HttpStatus.OK);
    }
}