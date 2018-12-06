package com.example.tim.controllers;

import com.example.tim.model.Group;
import com.example.tim.model.Role;
import com.example.tim.model.User;
import com.example.tim.repository.GroupRepository;
import com.example.tim.repository.RoleRepository;
import com.example.tim.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

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

    @RequestMapping(value = "/savegroup", method = RequestMethod.POST)
    public String save(Group group){
        groupRepository.save(group);
        return "redirect:/groupmanagement";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Optional<Group> findOne(Long id){
        return groupRepository.findById(id);
    }

    @RequestMapping(value = "/showGroupList", method = RequestMethod.GET)
    public String showGroupList(Model model){
        List<Group> groupList = groupRepository.findAll();
        List<User> userList = userRepository.findAll();
        Role userRole = roleRepository.findByName("ROLE_USER");
        List<User> userListNew = new ArrayList<>();

        for (User user : userList){
            if (user.getRoles().contains(userRole)){
                userListNew.add(user);
            }
        }

        model.addAttribute("groupList", groupList);
        model.addAttribute("userListNew", userListNew);
        return "groupList";
    }


    @RequestMapping(value = "/groupList", method = RequestMethod.GET)
    public String groupList(Model model){
        List<Group> groupList = groupRepository.findAll();
        model.addAttribute("groupList", groupList);
        return "redirect:/groupList";
    }

    @RequestMapping(value = "/assign", method = RequestMethod.POST)
    public String assign(Model model){

        return "redirect:/groupList";
    }


}
