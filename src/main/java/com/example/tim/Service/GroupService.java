package com.example.tim.Service;

import com.example.tim.DTO.GroupDTO;
import com.example.tim.Model.Group;

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
