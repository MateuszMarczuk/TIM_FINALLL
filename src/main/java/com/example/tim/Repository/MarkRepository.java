package com.example.tim.Repository;

import com.example.tim.Model.Mark;
import com.example.tim.Model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MarkRepository extends CrudRepository<Mark, Long> {

	Mark findById(long id);
	List<Mark> findAll();
}