package com.example.tim.controllers;
import com.example.tim.model.Subject;
import com.example.tim.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class SubjectController {

	@Autowired
	SubjectRepository subjectRepository;

	@RequestMapping(value = "/subject", method = RequestMethod.GET)
	public String subject(Model model){
        List<Subject> subjectsList = subjectRepository.findAll();
		model.addAttribute("subjectsList", subjectsList);
		return  "subject";

	}

	@RequestMapping(value = "/savesubject", method = RequestMethod.POST)
	public String save(Subject subject){
	    subjectRepository.save(subject);
	    return "redirect:/subject";
    }


}
