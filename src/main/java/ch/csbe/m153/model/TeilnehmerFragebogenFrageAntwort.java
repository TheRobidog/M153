package ch.csbe.m153.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="teilnehmerfragebogenfrageantwort")
public class TeilnehmerFragebogenFrageAntwort implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name="teilnehmerid",nullable=false)
	private Teilnehmer teilnehmer;
	@Id
	@ManyToOne
	@JoinColumn(name="fragebogenid",nullable=false)
	private Fragebogen fragebogen;
	@Id
	@ManyToOne
	@JoinColumn(name="frageid",nullable=false)
	private Frage frage;
	@Id
	@ManyToOne
	@JoinColumn(name="antwortid",nullable=false)
	private Antwort antwort;
	
	public TeilnehmerFragebogenFrageAntwort() {
		super();
	}
	
	public TeilnehmerFragebogenFrageAntwort(Teilnehmer teilnehmer, Fragebogen fragebogen, Frage frage,
			Antwort antwort) {
		super();
		this.teilnehmer = teilnehmer;
		this.fragebogen = fragebogen;
		this.frage = frage;
		this.antwort = antwort;
	}
	
	public Teilnehmer getTeilnehmer() {
		return teilnehmer;
	}
	public void setTeilnehmer(Teilnehmer teilnehmer) {
		this.teilnehmer = teilnehmer;
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
	public Antwort getAntwort() {
		return antwort;
	}
	public void setAntwort(Antwort antwort) {
		this.antwort = antwort;
	}
	
}
