package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.Coordinates;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class CoordinatesController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/coordinates/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getCoordinatesById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/coordinates")
    public ResponseEntity save(@RequestBody Coordinates coordinates) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSingleCoordinates(coordinates), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/coordinates/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSingleCoordinates(id), HttpStatus.OK);
    }
}