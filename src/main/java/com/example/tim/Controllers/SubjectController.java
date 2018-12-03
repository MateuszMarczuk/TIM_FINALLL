package com.example.tim.Controllers;
import com.example.tim.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class SubjectController {

	@Autowired
	SubjectRepository subjectRepository;

	@RequestMapping(value = "/marks", method = RequestMethod.GET)
	public String tables(Model moedel){
		moedel.addAttribute("subjects", subjectRepository.findAll());
		return  "marks";

	}


}
