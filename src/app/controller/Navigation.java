package app.controller;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class Navigation {
	private static Stage stage;
	
	public static void setStage(Stage s) {
        stage = s;
    }
	public static void cambiar(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader( Navigation.class.getResource("/app/view/login.fxml"));
            stage.setScene(new Scene(loader.load()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
	


