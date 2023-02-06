package pl.sda.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonsController {

    @GetMapping("/person")
    public String getPerson(){
        return "persons/home";
    }

    @PostMapping("/person")
    public String postPerson(){
        return "persons/home";
    }
}
