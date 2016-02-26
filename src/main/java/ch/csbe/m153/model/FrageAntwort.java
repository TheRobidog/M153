package ch.csbe.m153.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="frageantwort")
public class FrageAntwort implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name="frageid",nullable=false)
	private Frage frage;
	@Id
	@ManyToOne
	@JoinColumn(name="antwortid",nullable=false)
	private Antwort antwort;
	
	public FrageAntwort() {
		super();
	}
	
	public FrageAntwort(Frage frage, Antwort antwort) {
		super();
		this.frage = frage;
		this.antwort = antwort;
	}
	
	public Frage getFrage() {
		return frage;
	}
	public void setFrage(Frage frage) {
		this.frage = frage;
	}
	public Antwort getAntwort() {
		return antwort;
	}
	public void setAntwort(Antwort antwort) {
		this.antwort = antwort;
	}
	
}
