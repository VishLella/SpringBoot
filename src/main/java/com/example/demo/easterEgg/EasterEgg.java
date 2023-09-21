package com.example.demo.easterEgg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/easterEgg")
public class EasterEgg {

    @GetMapping
    public String easterEgg(){
        return "You found the easter egg!";
    }

}
