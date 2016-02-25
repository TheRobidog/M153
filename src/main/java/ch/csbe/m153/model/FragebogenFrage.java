package ch.csbe.m153.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="fragebogenfrage")
public class FragebogenFrage {

	@ManyToOne
	@JoinColumn(name="teilnehmerid",nullable=false)
	private Teilnehmer teilnehmer;
	@ManyToOne
	@JoinColumn(name="fragebogenid",nullable=false)
	private Fragebogen fragebogen;
	@ManyToOne
	@JoinColumn(name="frageid",nullable=false)
	private Frage frage;
	@ManyToOne
	@JoinColumn(name="antwortid",nullable=false)
	private Antwort antwort;
	
}
