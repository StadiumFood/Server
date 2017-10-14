package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.model.Sell;
import stadium.service.ControllerService;

import javax.validation.ConstraintViolationException;

@RestController
public class SellController {
    @Autowired
    private ControllerService controllerService;

    @CrossOrigin
    @GetMapping("/sell/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.getSellById(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping("/sell")
    public ResponseEntity save(@RequestBody Sell sell) throws ConstraintViolationException {
        return new ResponseEntity(controllerService.saveSingleSell(sell), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping("/sell/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) throws Exception {
        return new ResponseEntity(controllerService.deleteSingleSell(id), HttpStatus.OK);
    }
}