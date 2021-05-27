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

class TestBoundaryReportPage extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void reportTotale() {
		clickOn("#totaleB");
		sleep(2000);
	}

	@Test
	public void reportLibri() {
		clickOn("#libroB");
		sleep(2000);
	}
	
	@Test
	public void reportGiornali() {
		clickOn("#giornaliB");
		sleep(2000);
	}
	
	@Test
	public void reportRaccolta() {
		clickOn("#raccoltaB");
		sleep(2000);
	}
	@Test
	public void reportRiviste() {
		clickOn("#rivisteB");
		sleep(2000);
	}
	
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("reportPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();
	    
	    
	  }

}
