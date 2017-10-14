package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.Position;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class PositionController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/position/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getPositionById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/position")
    public ResponseEntity save(@RequestBody Position position) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSinglePosition(position), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/position/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSinglePosition(id), HttpStatus.OK);
    }
}