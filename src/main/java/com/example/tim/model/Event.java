package com.example.tim.model;

import java.util.Date;

import lombok.Data;


import javax.persistence.*;

@Entity
@Data
@Table(name ="event")
public class Event {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	private String title;
	private String description;
@Column(name="start")
	private Date start;
@Column(name="end1")
	private Date end;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Event(Long id, String title, String description, Date start, Date end) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.start = start;
		this.end = end;
	}

	public Event() {
		super();
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", description="
				+ description + ", start=" + start + ", end=" + end + "]";
	}
}