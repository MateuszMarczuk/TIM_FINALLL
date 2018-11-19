package com.example.tim.Repository;

import com.example.tim.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 08.11.2018.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmail(String email);
}