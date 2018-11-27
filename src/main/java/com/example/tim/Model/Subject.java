package com.example.tim.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class Subject {

	private Long id;
	private String name;
	private String typeOfActivities;
	private Mark mark;



	public Subject(){

	}

	public Subject(String typeOfActivities){
		this.typeOfActivities = typeOfActivities;

	}

	public Subject(String name, String typeOfActivities, Mark mark){
		this.name = name;
		this.typeOfActivities = typeOfActivities;
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

	public String getTypeOfActivities() {
		return typeOfActivities;
	}

	public void setTypeOfActivities(String typeOfActivities) {
		this.typeOfActivities = typeOfActivities;
	}

	@ManyToOne
	@JoinColumn(name = "mark_id")

	public Mark getMark(){

		return mark;
	}


}