package com.example.tim.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Subject_of_users")
@AllArgsConstructor
public class Subject {

	private Long id;
	private String name;
	private String typeOfAcitivities;
	private Mark mark;


	public Subject(){

	}

	public Subject(String typeOfAcitivities){
		this.typeOfAcitivities = typeOfAcitivities;

	}

	public Subject(String name, String typeOfAcitivities, Mark mark){
		this.name = name;
		this.typeOfAcitivities =typeOfAcitivities;
		this.mark = mark;

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfAcitivities() {
		return typeOfAcitivities;
	}

	public void setTypeOfAcitivities(String typeOfAcitivities) {
		this.typeOfAcitivities = typeOfAcitivities;
	}

	@ManyToOne
	@JoinColumn(name = "mark_id")

	public Mark getMark(){

		return mark;
	}


	public void setMark(Mark mark){
		this.mark = mark;
	}



}