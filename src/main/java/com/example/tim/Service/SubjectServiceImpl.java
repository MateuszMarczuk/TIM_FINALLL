package com.example.tim.Service;

import com.example.tim.Model.Subject;
import com.example.tim.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;



	public Subject findById(long id){
		return  subjectRepository.findById(id);
	}

	public List<Subject> findAll(){
		return subjectRepository.findAll();
	}






}
