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

class TestBoundaryLoginPage extends ApplicationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void login()
	{
		clickOn("#textFieldUsername");
		write("admin@admin.com");
		clickOn("#pwdField");
		write("admin871");
		clickOn("#buttonI");
		sleep(2000);
		
	}
	@Test
	public void registra()
	{
		clickOn("#buttonReg");
		sleep(2000);
		
	}
	@Test
	public void annulla()
	{
		clickOn("#buttonA");
		sleep(1000);
	}
	@Test
	public void resetPwd()
	{
		clickOn("#buttonReset");
		sleep(2000);
	}

	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("loginPage.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 
	

}
