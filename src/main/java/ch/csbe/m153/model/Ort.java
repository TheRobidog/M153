package ch.csbe.m153.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="ort")
public class Ort {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false)
	private Integer plz;
	@Column(length=32,nullable=false)
	private String ort;
	
	public Ort() {
		super();
	}
	
	public Ort(Integer plz, String ort) {
		super();
		this.plz = plz;
		this.ort = ort;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPlz() {
		return plz;
	}
	public void setPlz(Integer plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
}
