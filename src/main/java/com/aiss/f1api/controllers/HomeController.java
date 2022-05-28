package com.aiss.f1api.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * Created by JavaDeveloperZone on 19-07-2017.
 */
@Controller
public class HomeController {
    @GetMapping("/")                     // it will handle all request for /welcome
    public String SpringBootHello() {
        return "index";           // welcome is view name. It will call welcome.jsp
    }
}