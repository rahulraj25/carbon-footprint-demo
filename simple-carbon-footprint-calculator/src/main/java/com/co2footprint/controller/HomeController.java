package com.co2footprint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rahul Raj
 * @since 3/10/2019
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String viewHome() {
        return "index";
    }
}
