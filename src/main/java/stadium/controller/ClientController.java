package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.service.ControllerService;

@RestController
public class ClientController {
    @Autowired
    private ControllerService applicationService;

    @CrossOrigin
    @GetMapping("/client/{id}")
    public ResponseEntity greeting(@PathVariable("id") Integer id) throws Exception {
        return new ResponseEntity(applicationService.getClientById(id), HttpStatus.OK);
    }
}
