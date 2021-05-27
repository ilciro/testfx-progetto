package testFxjava8.tetsfv8;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import controller_app.SingeltonSystemState;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class TestBoundaryHomePageAfterLoginES extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("homePageAfterLoginES.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();
	  }
	
	@Test
	public void libri() throws IOException
	{
		SingeltonSystemState.getIstance().setTypeAsBook();

		clickOn("#buttonL");
		
	}
	@Test
	public void riviste() throws IOException
	{
		SingeltonSystemState.getIstance().setTypeAsMagazine();
		clickOn("#buttonR");
		
	}
	@Test
	public void giornali() throws IOException
	{
		SingeltonSystemState.getIstance().setTypeAsDaily();
		clickOn("#butonG");
		
	}
	@Test
	public void cerca()
	{
		clickOn("#buttonC");
		sleep(1000);
	}
	@Test
	public void logout()
	{
		clickOn("#buttonLogout");
		sleep(1000);
	}
	@Test
	public void profilo()
	{
		clickOn("#buttonProfile");
		sleep(1000);
	}
	@Test
	public void gestione()
	{
		clickOn("#buttonGestione");
		sleep(1000);
	}

}
