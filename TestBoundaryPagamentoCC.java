package testFxjava8.tetsfv8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loadui.testfx.GuiTest;
import org.testfx.framework.junit5.ApplicationTest;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

class TestBoundaryPagamentoCC extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void registra() {
		Button b=(Button)GuiTest.find("#buttonReg");
		b.setDisable(false);
		clickOn("#nomeTF");
		write("minnie");
		clickOn("#cognomeTF");
		write("topolino");
		clickOn("#codiceTF");
		write("1965-1523-5256-6333");
		clickOn("#scadTF");
		write("2025/15/11");
		clickOn("#codiceTFCiv");
		write("253");
		clickOn("#buttonReg");
		sleep(1000);
	}
	@Test
	public void ritorna()
	{
		RadioButton b=(RadioButton)GuiTest.find("#buttonPrendi");
		b.setDisable(false);

		clickOn("#nomeInput");
		write("minnie");
		clickOn("#buttonPrendi");
		sleep(1000);
	}
	@Test
	public void procedi()
	{
		clickOn("#codiceTF");
		write("1965-1523-5256-6333");
		clickOn("#scadTF");
		write("2025/15/11");
		clickOn("#codiceTFCiv");
		write("253");
		clickOn("#buttonI");
		sleep(1000);
	}
	@Test
	public void torna()
	{
		clickOn("#buttonA");
		sleep(1000);
	}
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("pagamentoCC.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  }

}
