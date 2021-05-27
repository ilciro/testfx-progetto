package testFxjava8.tetsfv8;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import database.UsersDao;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import users.singelton.User;

class TestBoundaryVisualizzaProfilo extends  ApplicationTest{

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	

	@Test
	public void dati() {
		User.getInstance().setNome("mario");
		User.getInstance().setCognome("rossi");
		User.getInstance().setEmail("mariorossi@gmail.com ");
		User.getInstance().setDataDiNascita(LocalDate.of(1960,11,21 ));
		//clickOn("#labelInsN");
		System.out.println("aaaa"+UsersDao.pickData(User.getInstance()).getNome());
		clickOn("#buttonCred");
		sleep(1000);
		
	}
	@Test
	public void indietro()
	{
		clickOn("#indietroB");
		sleep(1000);
	}
	@Test
	public void modifica()
	{
		clickOn("#modificaB");
		sleep(1000);
	}
	@Test
	public void cronologia()
	{
		clickOn("#cronologiaB");
		sleep(1000);
	}
	@Test
	public void cancella()
	{
		User.getInstance().setEmail("mariorossi@gmail.com");
		User.getInstance().setIdRuolo("u");
		clickOn("#cancellaB");
		sleep(1000);
	}
	@Override
	  public void start (Stage stage) throws Exception {
	    Parent mainNode = FXMLLoader.load(Main.class.getResource("visualizzaProfilo.fxml"));
	    stage.setScene(new Scene(mainNode));
	    stage.show();
	    stage.toFront();    
	    
	  } 

}
