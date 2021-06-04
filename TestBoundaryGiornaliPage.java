package testFxjava8.tetsfv8;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import controller_app.ControllerGiornalePage;
import controller_app.SingeltonSystemState;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class TestBoundaryGiornaliPage extends ApplicationTest{
	private ControllerGiornalePage cGP=new ControllerGiornalePage();

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	public void lista() throws SQLException {
		clickOn("#buttonGL");
		sleep(2000);
		assertNotNull(cGP.getGiornaliS());
	}
	@Test
	public void add()
	{
		Button b=(Button)GuiTest.find("#buttonAdd");
		clickOn("#buttonAdd");
		sleep(1000);
		assertEquals(b.getText(),"Aggiungi");
	}
	@Test
	public void modifica()
	{
		SingeltonSystemState.getIstance().setId(3);
		clickOn("#modB");
		sleep(1000);
		assertNotNull(SingeltonSystemState.getIstance().getId());
	}
	@Test
	public void elimina()
	{
		SingeltonSystemState.getIstance().setId(1);

		clickOn("#buttonDel");
		sleep(1000);
		assertNotEquals(-1,SingeltonSystemState.getIstance().getId());
	}
	@Test
	public void indietro()
	{
		Button b=(Button)GuiTest.find("#buttonB");
		clickOn("#buttonB");
		sleep(1000);
		assertEquals(b.getText(),"Indietro");
	}
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("giornalePage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 

}
