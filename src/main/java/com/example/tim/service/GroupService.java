package com.example.tim.service;

import com.example.tim.dto.GroupDTO;
import com.example.tim.model.Group;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 28.11.2018.
 */

public interface GroupService {

    Optional<Group> findById(Long id);
    Group save(GroupDTO groupDTO);
    Group findByName(String name);
    List<Group> findAll();
}
