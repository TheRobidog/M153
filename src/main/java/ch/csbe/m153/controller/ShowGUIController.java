package ch.csbe.m153.controller;

import java.util.ArrayList;
import java.util.List;

import ch.csbe.m153.model.Frage;
import ch.csbe.m153.model.Fragebogen;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowGUIController {

	@FXML
	protected Pane pnlMain;
	@FXML
	protected TableView<String> tbvFragebogen;
	@FXML
	private TableView<String> tbvFrage;
	
	private Integer fbint;
	
	public ShowGUIController() {
		super();
		FragebogenController fbc = new FragebogenController(null);
		List<Fragebogen> lfb = fbc.getAll();
		for(Fragebogen fb : lfb){
			List<String> ls = new ArrayList<String>();
			ls.add(fb.getId().toString());
			ls.add(fb.getName());
			tbvFragebogen.setItems((ObservableList<String>) ls);
		}
	}

	private void SelectionChanged(){
		tbvFragebogen
		FrageController fc = new FrageController(null);
		List<Frage> lf = fc.getAll();
		for(Frage f : lf){
			if(f.getId() == fbint){
				List<String> ls = new ArrayList<String>();
				ls.add(f.getId())
			}
		}
	}
	
}
