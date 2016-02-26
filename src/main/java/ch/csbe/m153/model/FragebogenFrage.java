package ch.csbe.m153.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="fragebogenfrage")
public class FragebogenFrage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name="fragebogenid",nullable=false)
	private Fragebogen fragebogen;
	@Id
	@ManyToOne
	@JoinColumn(name="frageid",nullable=false)
	private Frage frage;
	
	public FragebogenFrage() {
		super();
	}
	
	public FragebogenFrage(Fragebogen fragebogen, Frage frage) {
		super();
		this.fragebogen = fragebogen;
		this.frage = frage;
	}
	
	public Fragebogen getFragebogen() {
		return fragebogen;
	}
	public void setFragebogen(Fragebogen fragebogen) {
		this.fragebogen = fragebogen;
	}
	public Frage getFrage() {
		return frage;
	}
	public void setFrage(Frage frage) {
		this.frage = frage;
	}
	
}
