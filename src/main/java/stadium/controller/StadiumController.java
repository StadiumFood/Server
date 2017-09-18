package stadium.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StadiumController {
    @GetMapping("/greeting/{input}")
    public ResponseEntity greeting(@PathVariable("input") String input) {
        return new ResponseEntity("Hello "+input, HttpStatus.OK);
    }
}
