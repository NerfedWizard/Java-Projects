package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ForgotInfoController implements Initializable {
	@FXML
	private TextField email;
	@FXML
	private Button submit;
	@FXML
	private Label label;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	public void checkEmail() {
		label.setText("Reset Info Sent to " + email.getText());
		MySQLAccess.noReturnQuery("insert into user_email(email,message) values('" + email.getText()
				+ "','Please contact the school directly to change email')");
		closeStage();
		//if 0 then do the thing and add the 1 and do an  else
	}

	public void closeStage() {
		try {
			System.out.println("thread is sleeping for 5 seconds");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Stage stage = (Stage) submit.getScene().getWindow();
		stage.close();
	}

}
