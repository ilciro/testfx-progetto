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

class TestBoundaryPagamentoCash extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("pagamentoContrassegno.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  }
	@Test
	public void paga()
	{
		clickOn("#nomeTF");
		write("pippo");
		clickOn("#cognomeTF");
		write("paperino");
		clickOn("#viaTF");
		write("via paperopoli 2");
		clickOn("#eventualiArea");
		write("la consegna dopo le ore 12.\n prego contatare via telefono");
		clickOn("#buttonI");
		sleep(2000);
		
	}
	@Test
	public void annulla()
	{
		clickOn("#buttonA");
	}

}
