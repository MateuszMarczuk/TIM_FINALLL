package com.example.tim.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "mark")

public class Mark {

	private Long id;
	private int name;
	private Set<Subject> subjects;

	public Mark(){

	}

	public Mark(int name){
		this.name = name;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "mark", cascade = CascadeType.ALL)
	public Set<Subject> getSubjects(){

		return subjects;
	}

	public void setSubjects(Set<Subject> subjects){

		this.subjects = subjects;
	}



}
