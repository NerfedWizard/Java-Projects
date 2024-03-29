package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author loeln
 *
 */
public class GuardianView extends Application {
	@FXML
	private Scene scene;
	@FXML
	private AnchorPane root;

	/**
	 * 
	 */
	public GuardianView() {

	}

	@Override
	public void start(Stage guardStage) throws Exception {
		try {
			guardStage.setTitle(GuardianController.getUserGuardianNameForTitle());
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("GuardianView.fxml"));
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			guardStage.setScene(scene);
			guardStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}