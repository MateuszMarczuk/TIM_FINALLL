package com.example.tim.Controllers;

import com.example.tim.DTO.UserRegistrationDto;
import com.example.tim.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

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

	@RequestMapping(value = "/marks", method = RequestMethod.GET)
	public String marks(){
		return "marks";
	}

	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public String calendar(){
		return "calendar";
	}


	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String employee(){
		return "employee";
	}

}

