package ch.csbe.m153.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="unternehmen")
public class Unternehmen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="ortid",nullable=false)
	private Ort ort;
	@Column(length=32,nullable=false)
	private String name;
	@Column(length=32,nullable=false)
	private String strasse;
	@Column(length=32,nullable=false)
	private String nummer;
	
	public Unternehmen() {
		super();
	}
	
	public Unternehmen(Ort ort, String name, String strasse, String nummer) {
		super();
		this.ort = ort;
		this.name = name;
		this.strasse = strasse;
		this.nummer = nummer;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Ort getOrt() {
		return ort;
	}
	public void setOrt(Ort ort) {
		this.ort = ort;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getNummer() {
		return nummer;
	}
	public void setNummer(String nummer) {
		this.nummer = nummer;
	}
	
}
