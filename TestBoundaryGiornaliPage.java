package testFxjava8.tetsfv8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import controller_app.SingeltonSystemState;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class TestBoundaryGiornaliPage extends ApplicationTest{

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	public void lista() {
		clickOn("#buttonGL");
		sleep(2000);
	}
	@Test
	public void add()
	{
		clickOn("#buttonAdd");
		sleep(1000);
	}
	@Test
	public void modifica()
	{
		SingeltonSystemState.getIstance().setId(3);
		clickOn("#modB");
		sleep(1000);
	}
	@Test
	public void elimina()
	{
		SingeltonSystemState.getIstance().setId(1);

		clickOn("#buttonDel");
		sleep(1000);
	}
	@Test
	public void indietro()
	{
		clickOn("#buttonB");
		sleep(1000);
	}
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("giornalePage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 

}