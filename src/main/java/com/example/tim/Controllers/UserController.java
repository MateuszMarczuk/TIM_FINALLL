package com.example.tim.Controllers;

import com.example.tim.DTO.UserRegistrationDto;
import com.example.tim.Model.User;
import com.example.tim.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 08.11.2018.
 */
@Controller
@RequestMapping("/registration")
public class UserController {

    @Autowired
    private UserService userService;


    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showRegistrationForm(Model model){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto userRegistrationDto, BindingResult bindingResult){
        User existing = userService.findByEmail(userRegistrationDto.getEmail());
        if (existing != null) {
            bindingResult.rejectValue("email","Ten adres e-mail już istnieje w naszym serwisie !");
        }
        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userRegistrationDto);
        return "redirect:/registration?success";
    }

}
