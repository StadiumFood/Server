package stadium.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.Storage;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class StorageController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/storage/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getStorageById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/storage")
    public ResponseEntity save(@RequestBody Storage storage) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSingleStorage(storage), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/storage/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSingleStorage(id), HttpStatus.OK);
    }
}