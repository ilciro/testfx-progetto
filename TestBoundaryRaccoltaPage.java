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

class TestBoundaryRaccoltaPage extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void giornali() {
		clickOn("#buttonG");
		sleep(1000);
	}
	@Test
	public void riviste()
	{
		clickOn("#rivisteB");
		sleep(1000);
	}
	@Test
	public void libri()
	{
		clickOn("#libriB");
		sleep(1000);
	}

	 @Test
	 public void indietro()
	 {
		clickOn("#buttonI");
		sleep(1000);
	 }
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("raccoltaPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  }
}
