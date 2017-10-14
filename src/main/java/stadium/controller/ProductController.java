package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.Product;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class ProductController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/product/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getProductById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/product")
    public ResponseEntity save(@RequestBody Product product) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSingleProduct(product), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/product/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSingleProduct(id), HttpStatus.OK);
    }
}