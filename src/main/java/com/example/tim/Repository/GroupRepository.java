package com.example.tim.Repository;

import com.example.tim.Model.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 28.11.2018.
 */
@Repository
public interface GroupRepository extends CrudRepository<Group,Long> {
    Optional<Group> findById(Long id);
    Group findByName(String nameGroup);
}
