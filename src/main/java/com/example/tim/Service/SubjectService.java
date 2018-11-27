package com.example.tim.Service;

import com.example.tim.Model.Subject;
import java.util.List;

public interface SubjectService  {


	Subject findById(long id);
	List<Subject> findAll();




}
