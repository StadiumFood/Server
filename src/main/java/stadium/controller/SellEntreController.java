package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.SellEntre;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class SellEntreController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/sellEntre/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getSellEntreById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/sellEntre")
    public ResponseEntity save(@RequestBody SellEntre sellEntre) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSingleSellEntre(sellEntre), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/sellEntre/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSingleSellEntre(id), HttpStatus.OK);
    }
}