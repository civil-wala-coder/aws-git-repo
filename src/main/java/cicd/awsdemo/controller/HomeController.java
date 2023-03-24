package cicd.awsdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping
    public String getDemo(){
        return "welcome aws testing Hemant and Rahul did it !!";
    }
}
