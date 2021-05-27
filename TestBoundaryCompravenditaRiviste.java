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

class TestBoundaryCompravenditaRiviste extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void popolaTabella()
	{
		clickOn("#entryText");
		write("2");
		SingeltonSystemState.getIstance().setId(2);
		clickOn("#buttonL");
		sleep(2000);
	}
	@Test
	public void mostra()
	{
		clickOn("#entryText");
		System.out.println("id in test rivista mostra :"+SingeltonSystemState.getIstance().getId());
		write("2");
		clickOn("#buttonV");
		sleep(2000);
	}
	@Test
	public void procedi()
	{
		clickOn("#entryText");
		System.out.println("id in test rivista procedi :"+SingeltonSystemState.getIstance().getId());
		write("2");
		clickOn("#buttonA");
		sleep(2000);
		
	}
	@Test
	public void torna()
	{
		clickOn("#buttonI");
	}

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("compravenditaRivista.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 
}
