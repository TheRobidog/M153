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
	
	public Fragebogen() {
		super();
	}
	
	public Fragebogen(Unternehmen unternehmen, String name) {
		super();
		this.unternehmen = unternehmen;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Unternehmen getUnternehmen() {
		return unternehmen;
	}
	public void setUnternehmen(Unternehmen unternehmen) {
		this.unternehmen = unternehmen;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
