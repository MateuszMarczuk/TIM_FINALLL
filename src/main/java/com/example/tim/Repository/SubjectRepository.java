package com.example.tim.Repository;


import com.example.tim.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

	Subject findById(long id);
	List<Subject> findAll();


}
