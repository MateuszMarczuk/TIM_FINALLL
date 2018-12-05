package com.example.tim.Repository;

import com.example.tim.Model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 28.11.2018.
 */
@Repository
public interface GroupRepository extends JpaRepository<Group,Long> {
    Optional<Group> findById(Long id);
    Group findByName(String name);
    List<Group> findAll();


    @Transactional
    void deleteGroupById(Long id);
}
