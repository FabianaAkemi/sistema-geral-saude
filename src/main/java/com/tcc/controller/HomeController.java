package com.tcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by akemi on 27/02/17.
 */
@Controller
public class HomeController {

    @GetMapping("/saude")
    public String home(){
        return "layout/home";
    }

}
