package app.controller;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class Navigation {
	private static Stage stage;
	
	public static void setStage(Stage s) {
        stage = s;
    }
	public static void cambiar(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader( Navigation.class.getResource(fxml));
            Parent root = loader.load();
	    	Scene scene =new Scene(root,300,400);
	    	stage.setScene(scene);
	    	scene.getStylesheets().add(
	    			Navigation.class.getResource("/app/view/style.css").toExternalForm()
	    			);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
	


