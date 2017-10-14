package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.Type;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class TypeController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/type/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getTypeById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/type")
    public ResponseEntity save(@RequestBody Type type) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSingleType(type), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/type/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSingleType(id), HttpStatus.OK);
    }
}