package com.example.tim.service;

import com.example.tim.model.Subject;
import java.util.List;

public interface SubjectService  {


	Subject findById(long id);
	List<Subject> findAll();




}
