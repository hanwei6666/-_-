package bcu.edu.bysj.controller;

import bcu.edu.bysj.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private LoginService loginService;

    @RequestMapping("/login")
        public String login(){

        return"ok";
    }



}