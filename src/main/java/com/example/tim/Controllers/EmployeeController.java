package com.example.tim.Controllers;

import com.example.tim.Model.User;
import com.example.tim.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 28.11.2018.
 */
@Controller
public class EmployeeController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String tables(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "employee";
    }
}
