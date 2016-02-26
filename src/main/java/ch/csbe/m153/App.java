package ch.csbe.m153;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ch.csbe.m153.dao.Access;
import ch.csbe.m153.dao.Database;
import ch.csbe.m153.model.Teilnehmer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Logger logger = LogManager.getLogger(App.class);		
		logger.info("Hello World!");
		
		//Access<Teilnehmer> act = new Access<Teilnehmer>(Teilnehmer.class);
		//Teilnehmer t = new Teilnehmer("Muster","Max","Max.Muster@example.com",360000,null);
		//act.save(t);
		
		LoadGUI.main(args);
		
		Database.close();
    }
    
    public void start(Stage stage) throws Exception {
		Parent page = FXMLLoader.load(getClass().getResource("view/befragung.fxml"));
		Scene scene = new Scene(page);
		stage.setScene(scene);
		stage.setTitle("Befragung");
		stage.show();
	}
}
