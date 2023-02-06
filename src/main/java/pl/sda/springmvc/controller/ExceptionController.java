package pl.sda.springmvc.controller;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler({NullPointerException.class, IndexOutOfBoundsException.class})
    public String getNullPointerException(RuntimeException e){
        return "exception";
    }
}
