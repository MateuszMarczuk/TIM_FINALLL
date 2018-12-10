package com.example.tim.restController;

import com.example.tim.model.Role;
import com.example.tim.model.User;
import com.example.tim.repository.RoleRepository;
import com.example.tim.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 07.12.2018.
 */
@RestController
public class UserRestController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @RequestMapping(value = "/students/all", method = RequestMethod.GET)
    @ResponseBody
    public String tables( ){
        List<User> users = userRepository.findAll();
        Role userRole = roleRepository.findByName("ROLE_USER");
        List<User> userList = new ArrayList<>();

        for (User user : users){
            if (user.getRoles().contains(userRole)){
                userList.add(user);
            }
        }
        return "userList";
    }

}
