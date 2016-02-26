package ch.csbe.m153;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoadGUI {

	public static void main(String[] args){
		Application.launch(args);
	}
	
	public void start(Stage stage) throws Exception {
		Parent page = FXMLLoader.load(getClass().getResource("view/befragung.fxml"));
		Scene scene = new Scene(page);
		stage.setScene(scene);
		stage.setTitle("Befragung");
		stage.show();
	}
	
}
