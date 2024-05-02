package com.ch.anyway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anyway")
public class MainController {

    @GetMapping
    public String home() {
        return "pages/index";
    }
}
