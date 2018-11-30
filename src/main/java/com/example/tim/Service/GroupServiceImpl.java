package com.example.tim.Service;

import com.example.tim.DTO.GroupDTO;
import com.example.tim.Model.Group;
import com.example.tim.Repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        group.setNameGroup(groupDTO.getNameGroup());
        return groupRepository.save(group);
    }

    @Transactional
    public Group findByName(String nameGroup) {
        return groupRepository.findByName(nameGroup);
    }

}
