package com.cricbuzz.Model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Matches_Schedules")
public class cricbuzz {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "team1", nullable = false)
	private String team1;

	@Column(name = "team2", nullable = false)
	private String team2;

	@Column(name = "form", nullable = false)
	private String form;

	@Column(name = "date", nullable = false)
	private String date;

	@Column(name = "time", nullable = false)
	private String time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public cricbuzz(int id, String team1, String team2, String form, String date, String time) {
		super();
		this.id = id;
		this.team1 = team1;
		this.team2 = team2;
		this.form = form;
		this.date = date;
		this.time = time;
	}

	public cricbuzz() {
		super();
		// TODO Auto-generated constructor stub
	}

}
