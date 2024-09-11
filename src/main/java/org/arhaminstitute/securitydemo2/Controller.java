package org.arhaminstitute.securitydemo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{

    @GetMapping("/")
    public String sayHi(){
        return "Hello All";
    }

}
