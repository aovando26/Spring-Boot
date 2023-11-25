package com.springbootlearning.learningspringboot3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// communicates this class as controller
@Controller
public class HomeController {

    // maps call with HTTP GET method
    @GetMapping("/")
    public String index() {

        // name of template to render
        return "index";
    }
}
