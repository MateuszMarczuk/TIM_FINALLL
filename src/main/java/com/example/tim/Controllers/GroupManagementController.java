package com.example.tim.Controllers;

import com.example.tim.Model.Group;
import com.example.tim.Repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping(value = "/deletegroup/{id}", method = RequestMethod.GET)
    public String deleteGroup(Model model, @PathVariable("id") Long id){
        Group group = groupRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Niepoprawne id grupy" + id));
        groupRepository.deleteGroupById(id);
        model.addAttribute("groups", groupRepository.findAll());
        return "redirect:/groupmanagement";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Optional<Group> findOne(Long id){
        return groupRepository.findById(id);
    }

}
