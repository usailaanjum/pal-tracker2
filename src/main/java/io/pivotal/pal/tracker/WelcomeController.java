package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String message;

//we are configuring to provide our app with environment variables when it is executed
//@Value takes a specific format to reference an environment variable
//usually on a constructor
    public WelcomeController(@Value("${welcome.message}") String message){

        this.message = message;
    }
    @GetMapping("/")
    public String sayHello() {
        return message;
    }
}
