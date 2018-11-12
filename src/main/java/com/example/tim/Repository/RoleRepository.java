package com.example.tim.Repository;

import com.example.tim.Model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 12.11.2018.
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
