package ch.csbe.m153.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="teilnehmerfragebogenfrageantwort")
public class TeilnehmerFragebogenFrageAntwort {

	@ManyToOne
	@JoinColumn(name="fragebogenid",nullable=false)
	private Fragebogen fragebogen;
	@ManyToOne
	@JoinColumn(name="frageid",nullable=false)
	private Frage frage;
	
}
