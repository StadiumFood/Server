package stadium.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import stadium.dto.ResponseDTO;
import stadium.utils.ReplyCodes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public ResponseEntity handleClientNotFoundException(HttpServletRequest request, Exception e){
        return null;
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public ResponseEntity handleNotValidDataToSave(HttpServletRequest request, ConstraintViolationException ex){
        ResponseDTO dto = new ResponseDTO();
        List<String> notValidField = new ArrayList<>();
        ex.getConstraintViolations().forEach(item->{
            notValidField.add(item.getPropertyPath().toString());
        });
        dto.setInfo(ReplyCodes.INTERNAL_ERROR, "Not valid fields: "+notValidField);
        return new ResponseEntity(dto, HttpStatus.OK);
    }
}
