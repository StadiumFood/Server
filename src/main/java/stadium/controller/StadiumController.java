package stadium.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stadium.service.ClientService;

@RestController
public class StadiumController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/greeting/{input}")
    public ResponseEntity greeting(@PathVariable("input") String input) {
        return new ResponseEntity("Hello "+input, HttpStatus.OK);
    }
}
