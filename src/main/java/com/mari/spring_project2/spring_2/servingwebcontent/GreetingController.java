package com.mari.spring_project2.spring_2.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           @RequestParam(name="surName", required=false, defaultValue="is great!") String surName,
                           Model model) {
        model.addAttribute("name", name);
        model.addAttribute("surName", surName);
        return "greeting";
    }

    @GetMapping("/")
    public String greeting_home(){
        return "home";
    }

}
