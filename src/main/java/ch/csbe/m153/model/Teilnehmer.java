package ch.csbe.m153.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="teilnehmer")
public class Teilnehmer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(length=32,nullable=false)
	private String name;
	@Column(length=32,nullable=false)
	private String vorname;
	@Column(length=32,nullable=false)
	private String email;
	@Column
	private Integer lieferzeit;
	@Column(length=32)
	private String zahlungsweise;
	
	public Teilnehmer() {
		super();
	}
	
	public Teilnehmer(String name, String vorname, String email, Integer lieferzeit, String zahlungsweise) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.email = email;
		this.lieferzeit = lieferzeit;
		this.zahlungsweise = zahlungsweise;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getLieferzeit() {
		return lieferzeit;
	}
	public void setLieferzeit(Integer lieferzeit) {
		this.lieferzeit = lieferzeit;
	}
	public String getZahlungsweise() {
		return zahlungsweise;
	}
	public void setZahlungsweise(String zahlungsweise) {
		this.zahlungsweise = zahlungsweise;
	}
	
}
