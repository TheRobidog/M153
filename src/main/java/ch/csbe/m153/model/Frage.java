package ch.csbe.m153.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="frage")
public class Frage {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="fragebereichid")
	private Fragebereich fragebereich;
	@Column(length=100,nullable=false)
	private String text;
	
	public Frage() {
		super();
	}
	
	public Frage(Fragebereich fragebereich, String text) {
		super();
		this.fragebereich = fragebereich;
		this.text = text;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Fragebereich getFragebereich() {
		return fragebereich;
	}
	public void setFragebereich(Fragebereich fragebereich) {
		this.fragebereich = fragebereich;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
