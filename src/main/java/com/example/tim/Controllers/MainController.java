package com.example.tim.Controllers;

import com.example.tim.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 12.11.2018.
 */

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/", method = GET)
    public String root(){
        return "index";
    }

    @RequestMapping(value = "/login", method = GET)
    public String login(Model model){
        return "login";
    }

    @RequestMapping(value = "/user", method = GET)
    public String userIndex(){
        return "user/index";
    }



}

