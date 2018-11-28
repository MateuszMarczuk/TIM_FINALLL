package com.example.tim.Service;

import com.example.tim.DTO.GroupDTO;
import com.example.tim.Model.Group;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 28.11.2018.
 */
@Service
public interface GroupService {
    Optional<Group> findById(Long id);
    Group save(GroupDTO groupDTO);
    Group findByName(String nameGroup);
}
