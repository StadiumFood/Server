package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.Client;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class ClientController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/client/{id}")
    public ResponseEntity getClientById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getClientById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/client")
    public ResponseEntity saveSingleClient(@RequestBody Client client) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSingleClient(client), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/client/{id}")
    public ResponseEntity deleteSingleClient(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSingleClient(id), HttpStatus.OK);
    }


}