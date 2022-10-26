package com.spring.security.security.demo.controllers;

import com.spring.security.security.demo.security.PersonDetails;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/show")
    public String show() {
        return "show";
    }

    @GetMapping("/show/full")
    public String showFull(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();

        System.out.println(personDetails.returnPerson());

        return "show";
    }
}
