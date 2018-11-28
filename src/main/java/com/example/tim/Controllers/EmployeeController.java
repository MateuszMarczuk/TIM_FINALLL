package com.example.tim.Controllers;

import com.example.tim.Model.Role;
import com.example.tim.Model.User;
import com.example.tim.Repository.RoleRepository;
import com.example.tim.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 28.11.2018.
 */
@Controller
public class EmployeeController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String tables(Model model){
        List<User> users = userRepository.findAll();
        Role userRole = roleRepository.findByName("ROLE_ADMIN");
        List<User> userList = new ArrayList<>();

        for (User user : users) {
            if (user.getRoles().contains(userRole)){
                userList.add(user);
            }
        }

        model.addAttribute("users", userList);
        return "employee";
    }
}
