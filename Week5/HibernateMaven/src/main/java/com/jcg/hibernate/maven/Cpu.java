package com.jcg.hibernate.maven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cpu")
public class Cpu {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "model")
	private String model;

	@Column(name = "nucleus")
	private int nucleus;

	@Column(name = "frequency")
	private double frequency;

	//constructors
	public Cpu(){};
	public Cpu(int id, String model, int nucleus, double frequency){
		this.id = id;
		this.model = model;
		this.nucleus = nucleus;
		this.frequency = frequency;
	}

	//getters&setters
	public String getModel() {
		return model;
	}
	public int getNucleus() {
		return nucleus;
	}
	public double getFrequency() {
		return frequency;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public void setNucleus(int nucleus) {
		this.nucleus = nucleus;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}