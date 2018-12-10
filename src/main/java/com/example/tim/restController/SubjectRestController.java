package com.example.tim.restController;


import com.example.tim.model.Subject;
import com.example.tim.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 09.12.2018.
 */
@RestController
public class SubjectRestController {

    @Autowired
    private SubjectRepository subjectRepository;

    @RequestMapping(value = "/subject/all", method = RequestMethod.GET)
    public List<Subject> subjects(){
        return subjectRepository.findAll();
    }

}
