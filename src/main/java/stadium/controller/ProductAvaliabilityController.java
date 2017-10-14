package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.ProductAvaliability;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class ProductAvaliabilityController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/productAvaliability/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getPositionById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/productAvaliability")
    public ResponseEntity save(@RequestBody ProductAvaliability productAvaliability) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSingleProductAvaliability(productAvaliability), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/productAvaliability/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSingleProductAvaliability(id), HttpStatus.OK);
    }
}