package com.example.tim.repository;

import com.example.tim.model.Mark;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MarkRepository extends CrudRepository<Mark, Long> {

	Mark findById(long id);
	List<Mark> findAll();
}
