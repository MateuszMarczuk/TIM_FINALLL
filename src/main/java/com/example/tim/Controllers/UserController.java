package com.example.tim.Controllers;

import com.example.tim.Model.Role;
import com.example.tim.Model.User;
import com.example.tim.Repository.RoleRepository;
import com.example.tim.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 26.11.2018.
 */
@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String tables(Model model){
        List<User> users = userRepository.findAll();
        Role userRole = roleRepository.findByName("ROLE_USER");
        List<User> userList = new ArrayList<>();

        for (User user : users){
            if (user.getRoles().contains(userRole)){
                userList.add(user);
            }
        }

        model.addAttribute("users", userList);
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
