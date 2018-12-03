package com.example.tim.Repository;

import com.example.tim.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 08.11.2018.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
    List<User> findAll();


    @Transactional
    void deleteUserById(Long id);

}
