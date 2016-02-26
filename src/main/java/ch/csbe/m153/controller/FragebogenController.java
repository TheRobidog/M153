package ch.csbe.m153.controller;

import java.util.List;

import ch.csbe.m153.dao.Access;
import ch.csbe.m153.model.Fragebogen;

public class FragebogenController {

	private Access<Fragebogen> access;
	private Fragebogen fragebogen;
	
	public FragebogenController(Fragebogen fragebogen) {
		super();
		this.fragebogen = fragebogen;
		this.access = new Access<Fragebogen>(Fragebogen.class);
	}
	
	public void save(){
		access.save(fragebogen);		
	}
	
	public Fragebogen getSingle(){
		fragebogen = access.getById(fragebogen.getId());
		return fragebogen;
	}
	
	public List<Fragebogen> getAll(){
		return access.getAll();
	}
	
	public void update(){
		access.update(fragebogen);
	}
	
	public void delete(){
		access.delete(fragebogen);
	}
	
	public Access<Fragebogen> getAccess() {
		return access;
	}
	public void setAccess(Access<Fragebogen> access) {
		this.access = access;
	}
	public Fragebogen getFragebogen() {
		return fragebogen;
	}
	public void setFragebogen(Fragebogen fragebogen) {
		this.fragebogen = fragebogen;
	}
	
}
