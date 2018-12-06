package com.example.tim.service;

import com.example.tim.dto.GroupDTO;
import com.example.tim.model.Group;
import com.example.tim.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 28.11.2018.
 */
@Service
public class GroupServiceImpl implements GroupService{

    @Autowired
    GroupRepository groupRepository;

    public Optional<Group> findById(Long id) {
        return groupRepository.findById(id);
    }


    public Group save(GroupDTO groupDTO) {
        Group group = new Group();
        group.setName(groupDTO.getName());
        return groupRepository.save(group);
    }

    @Transactional
    public Group findByName(String name) {
        return groupRepository.findByName(name);
    }

    @Override
    public List<Group> findAll() {
        return groupRepository.findAll();
    }

}
