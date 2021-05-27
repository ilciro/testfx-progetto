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

class TestBoundaryUserPage extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void lista() {
		clickOn("#buttonP");//fail("Not yet implemented");
		sleep(1000);
	}
	@Test
	public void aggiungi()
	{
		clickOn("#buttonA");
		sleep(1000);
	}
	@Test
	public void modifica()
	{
		clickOn("#utenteTF");
		write("16");
		clickOn("#buttonM");
		sleep(1000);
	}
	
	@Test
	public void cancella()
	{
		clickOn("#utenteTF");
		write("16");
		clickOn("#buttonC");
		sleep(1000);
	}
	@Test
	public void indietro()
	{
		clickOn("#indietro");
		sleep(1000);
	}

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("userPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();
	    
	    
	  }

}
