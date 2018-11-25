package com.example.tim.Repository;

import com.example.tim.Model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarkRepository extends CrudRepository<Role, Long> {
}