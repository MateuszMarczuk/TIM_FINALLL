package com.example.tim.Service;

import com.example.tim.DTO.UserRegistrationDto;
import com.example.tim.Model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 08.11.2018.
 */
@Service
public interface UserService extends UserDetailsService {

    User findByEmail(String email);
    User save(UserRegistrationDto registration);
    List<User> findAll();
    void deleteUserById(Long id);
    //void delete(Long id);
}
