package testFxjava8.tetsfv8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class TestBoundaryRicercaPerTipo extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void libri() {
		clickOn("#buttonL");
	}
	@Test
	public void riviste() {
		clickOn("#buttonR");
	}@Test
	public void gironali() {
		clickOn("#buttonG");
	}
	@Test
	public void indietro() {
		clickOn("#buttonB");
	}


	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("ricercaPerTipo.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  }
}
