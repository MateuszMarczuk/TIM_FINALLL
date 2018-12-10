package com.example.tim.restController;

import com.example.tim.model.Group;
import com.example.tim.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 07.12.2018.
 */
@RestController
public class GroupRestController {

    @Autowired
    GroupRepository groupRepository;

    @GetMapping(value = "/groupmanagement/all")
    public List<Group> showGroupMamagement() {
        return groupRepository.findAll();
    }
}
