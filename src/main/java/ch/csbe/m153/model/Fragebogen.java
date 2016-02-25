package ch.csbe.m153.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="fragebogen")
public class Fragebogen {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="unternehmenid",nullable=false)
	private Unternehmen unternehmen;
	@Column(length=100,nullable=false)
	private String name;
	
}