package testFxjava8.tetsfv8;

import static org.junit.jupiter.api.Assertions.*;

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

class TestBoundaryRicercaPage extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void ricercaLibroTitolo()
	{
		SingeltonSystemState.getIstance().setTypeAsBook();
		clickOn("#cercaT");
		write("Il libro dello splendore");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SingeltonSystemState.getIstance().getType(),"libro");
		
	}
	@Test
	public void ricercaLibroAutore()
	{
		SingeltonSystemState.getIstance().setTypeAsBook();
		clickOn("#cercaT");
		write("Zerocalcare");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SingeltonSystemState.getIstance().getType(),"libro");

		
	}
	@Test
	public void ricercaLibroId()
	{
		SingeltonSystemState.getIstance().setTypeAsBook();
		clickOn("#idT");
		write("6");
		SingeltonSystemState.getIstance().setId(5);
		clickOn("#buttonV");
		sleep(2000);
		assertNotNull(SingeltonSystemState.getIstance().getId());
		
	}
	@Test
	public void ricercaGiornaleTitolo()
	{
		SingeltonSystemState.getIstance().setTypeAsDaily();
		clickOn("#cercaT");
		write("la gazzetta del profeta");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SingeltonSystemState.getIstance().getType(),"giornale");

		
	}
	@Test
	public void ricercaLibroEditore()
	{
		SingeltonSystemState.getIstance().setTypeAsDaily();
		clickOn("#cercaT");
		write("il ministero");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SingeltonSystemState.getIstance().getType(),"giornale");

		
	}
	@Test
	public void ricercaGiornaleId()
	{
		SingeltonSystemState.getIstance().setTypeAsDaily();
		clickOn("#idT");
		write("3");
		SingeltonSystemState.getIstance().setId(3);
		clickOn("#buttonV");
		sleep(2000);
		assertNotNull(SingeltonSystemState.getIstance().getId());
		
	}
	
	@Test
	public void ricercaRivistaTitolo()
	{
		SingeltonSystemState.getIstance().setTypeAsMagazine();
		clickOn("#cercaT");
		write("focus");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SingeltonSystemState.getIstance().getType(),"rivista");

		
	}
	
	@Test
	public void ricercaRivistaAutore()
	{
		SingeltonSystemState.getIstance().setTypeAsMagazine();
		clickOn("#cercaT");
		write("Bao Publishing");
		clickOn("#buttonC");
		sleep(2000);
		assertEquals(SingeltonSystemState.getIstance().getType(),"rivista");

		
	}
	
	@Test
	public void ricercaRivistaId()
	{
		SingeltonSystemState.getIstance().setTypeAsMagazine();
		clickOn("#idT");
		write("5");
		clickOn("#buttonV");
		sleep(2000);
		assertNotNull(SingeltonSystemState.getIstance().getId());
		
	}
	
	@Test
	public void indietro()
	{
		Button b=(Button)GuiTest.find("#buttonB");
		clickOn("#buttonB");
		assertEquals(b.getText(),"Indietro");
	}

	
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("ricercaPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 
	

}
