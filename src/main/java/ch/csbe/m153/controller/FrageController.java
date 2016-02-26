package ch.csbe.m153.controller;

import java.util.List;

import ch.csbe.m153.dao.Access;
import ch.csbe.m153.model.Frage;

public class FrageController {

	private Access<Frage> access;
	private Frage frage;
	
	public FrageController(Frage frage) {
		super();
		this.frage = frage;
		this.access = new Access<Frage>(Frage.class);
	}
	
	public void save(){
		access.save(frage);		
	}
	
	public Frage getSingle(){
		frage = access.getById(frage.getId());
		return frage;
	}
	
	public List<Frage> getAll(){
		return access.getAll();
	}
	
	public void update(){
		access.update(frage);
	}
	
	public void delete(){
		access.delete(frage);
	}
	
	public Access<Frage> getAccess() {
		return access;
	}
	public void setAccess(Access<Frage> access) {
		this.access = access;
	}
	public Frage getFrage() {
		return frage;
	}
	public void setFrage(Frage frage) {
		this.frage = frage;
	}
	
}
