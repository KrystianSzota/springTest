package pl.sda.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

   // @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping
    public String getHome(){
        return "home";
    }

    @GetMapping("/**")
    public String get404(){
        return "error404";
    }
}
