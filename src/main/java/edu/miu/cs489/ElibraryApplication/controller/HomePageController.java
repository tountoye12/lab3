package edu.miu.cs489.ElibraryApplication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomePageController {


    @GetMapping(value = {"/", "/home", "/elibrary"})
    public String homePage(){
        return "home/index";
    }
}
