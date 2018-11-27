package com.example.tim.Controllers;

import com.example.tim.Model.User;
import com.example.tim.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 26.11.2018.
 */
@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String tables(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "students";
    }


    @RequestMapping(value = "/delete/{id}", method = GET)
    public String delete(Model model, @PathVariable("id") Long id){
        User user = userRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Niepoprawne id : " + id));
        userRepository.deleteUserById(id);
        model.addAttribute("students", userRepository.findAll());
        return "redirect:/students";
    }

}
