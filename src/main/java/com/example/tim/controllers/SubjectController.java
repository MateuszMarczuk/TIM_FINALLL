package com.example.tim.controllers;
import com.example.tim.model.Group;
import com.example.tim.model.Subject;
import com.example.tim.model.User;
import com.example.tim.repository.GroupRepository;
import com.example.tim.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class SubjectController {

	@Autowired
	SubjectRepository subjectRepository;

	@Autowired
	GroupRepository groupRepository;

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

    @RequestMapping(value = "/showSubjectList", method = RequestMethod.GET)
    public String showGroupList(Model model){
        List<Group> groupList = groupRepository.findAll();
        List<Subject> subjectList = subjectRepository.findAll();

        List<Subject> subjectsListNew = new ArrayList<>();

        for (Subject user : subjectList){
            subjectsListNew.add(user);

        }

        model.addAttribute("groupList", groupList);
        model.addAttribute("subjectListNew", subjectsListNew);
        return "subjectList";
    }

    @RequestMapping(value = "/assignsubject", method = RequestMethod.POST)
    public String assign(@RequestParam("groupId") Long idgroup, @RequestParam("subjectId") Long idsubject){

        Subject subject = subjectRepository.findById(idsubject).get();
        Group group = groupRepository.findById(idgroup).get();
        //group.setSubjects((List<Subject>) subject);
        //subject.setGroups((List<Group>) group);
        groupRepository.save(group);

        return "redirect:/groupmanagement";
    }

    @RequestMapping(value = "/deletesubject/{id}", method = RequestMethod.GET)
    public String deleteSubject(Model model, @PathVariable("id") Long id){
        Subject subject = subjectRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Niepoprawne id przedmiotu : " + id));
        subjectRepository.deleteSubjectById(id);
        model.addAttribute("subjects", subjectRepository.findAll());
        return "redirect:/subject";
    }

    @GetMapping("/findOneSubject")
    @ResponseBody
    public Optional<Subject> findOne(Long id){
        return subjectRepository.findById(id);
    }

}
