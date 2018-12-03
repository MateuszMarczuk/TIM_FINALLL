package com.example.tim.Controllers;

import com.example.tim.Model.Group;
import com.example.tim.Repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 03.12.2018.
 */
@Controller
public class GroupManagementController {

    @Autowired
    private GroupRepository groupRepository;

    @GetMapping(value = "/groupmanagement")
    public String showGroupMamagement(Model model) {
        List<Group> groups = groupRepository.findAll();
        model.addAttribute("groups", groups);
        return "groupmanagement";
    }

//    @RequestMapping(value = "/showgroup", method = RequestMethod.GET)
//    public String groupList(Model model){
//        List<Group> groups = groupRepository.findAll();
//        model.addAttribute("groups", groups);
//        return "group";
//    }
}
