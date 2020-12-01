package bcu.edu.bysj.controller;

import bcu.edu.bysj.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    private LoginService loginService;

    @RequestMapping("/")
        public String login(){
        return "index.html";
    }

}
