package testFxjava8.tetsfv8;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import controller_app.SingeltonSystemState;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class TestBoundaryHomePageAfterLogin extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("homePageAfterLogin.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();
	  }
	
	@Test
	public void libri() throws IOException
	{
		SingeltonSystemState.getIstance().setTypeAsBook();
		clickOn("#buttonL");
		assertEquals(SingeltonSystemState.getIstance().getType(),"libro");
		
	}
	@Test
	public void riviste() throws IOException
	{
		SingeltonSystemState.getIstance().setTypeAsMagazine();
		clickOn("#buttonR");
		assertEquals(SingeltonSystemState.getIstance().getType(),"rivista");

		
	}
	@Test
	public void giornali() throws IOException
	{
		SingeltonSystemState.getIstance().setTypeAsDaily();
		clickOn("#butonG");
		assertEquals(SingeltonSystemState.getIstance().getType(),"giornale");

	}
	@Test
	public void cerca()
	{
		Button b=(Button)GuiTest.find("#buttonC");
		clickOn("#buttonC");
		sleep(1000);
		assertEquals(b.getText(),"Cerca");
	}
	@Test
	public void logout()
	{
		Button b=(Button)GuiTest.find("#buttonLogout");

		clickOn("#buttonLogout");
		sleep(1000);
		assertEquals(b.getText(),"Logout");

	}
	@Test
	public void profilo()
	{
		Button b=(Button)GuiTest.find("#buttonProfile");

		clickOn("#buttonProfile");
		sleep(1000);
		assertEquals(b.getText(),"Visualizza Profilo");
	}
}
