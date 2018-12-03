package com.example.tim.Controllers;

import com.example.tim.DTO.GroupDTO;
import com.example.tim.Model.Group;
import com.example.tim.Repository.GroupRepository;
import com.example.tim.Service.GroupService;
import com.example.tim.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 28.11.2018.
 */
@Controller
@RequestMapping(value = "/addGroup", method = RequestMethod.GET)
public class GroupAddController {

    @Autowired
    private GroupService groupService;

    @ModelAttribute("group")
    public GroupDTO groupDTO(){
        return new GroupDTO();
    }

    @GetMapping(value = "/addGroup")
    public String showAddGroup(){
       return "addGroup";
    }

    @PostMapping
    public String addGroup(@ModelAttribute("group") @Valid GroupDTO groupDTO, BindingResult result){
        Group existing = groupService.findByName(groupDTO.getName());
        if (existing != null) {
            result.rejectValue("name", "null","Nazwa takiej grupy już istnieje");
        }
        if (result.hasErrors()){
            return "students";
        }

       groupService.save(groupDTO);
        return "redirect:/students?success";
    }
}
