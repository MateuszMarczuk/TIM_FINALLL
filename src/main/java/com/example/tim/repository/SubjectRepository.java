package com.example.tim.repository;


import com.example.tim.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

	Subject findById(long id);
	List<Subject> findAll();

    @Transactional
    void deleteSubjectById(Long id);


}
