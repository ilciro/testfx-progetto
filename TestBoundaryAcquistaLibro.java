package testFxjava8.tetsfv8;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import controller_app.ControllerAcquista;
import controller_app.SingeltonSystemState;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

class TestBoundaryAcquistaLibro extends ApplicationTest {
	private ControllerAcquista cA=new ControllerAcquista();
	


	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	

	@Test
	public void provaCalcolo() throws SQLException {
		
				
		clickOn("#quantita");
		write("5");
		clickOn("#calcola");
		sleep(3000);
	//	clickOn("#ritiroN");
		//clickOn("#buttonCC");
		
		
		}
	@Test
	public void torna()
	{
		clickOn("#link");
		sleep(1000);
	}
	
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("acquista.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();
	    
	    
	  }
	@Test
	public void pagaCC()
	{
		RadioButton b=(RadioButton)GuiTest.find("#buttonCC");
		b.setDisable(false);
		clickOn("#buttonCC");
		sleep(1000);
	}
	@Test
	public void pagaCash()
	{
		RadioButton b=(RadioButton)GuiTest.find("#buttonCash");
		b.setDisable(false);
		clickOn("#buttonCash");
		sleep(1000);
	}
	
	

}
