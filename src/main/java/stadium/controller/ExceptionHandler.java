package stadium.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public ResponseEntity handleClientNotFoundException(HttpServletRequest request, Exception e){
        return null;
    }
}
