package ch.csbe.m153.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="frageantwort")
public class FrageAntwort {

	@ManyToOne
	@JoinColumn(name="frageid",nullable=false)
	private Frage frage;
	@ManyToOne
	@JoinColumn(name="antwortid",nullable=false)
	private Antwort antwort;
	
}
