package app;

import app.controller.Navigation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	    @Override
	    public void start(Stage stage) throws Exception {
	    	Navigation.setStage(stage);
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/view/login.fxml"));
	    	Parent root = loader.load();
	    	Scene scene =new Scene(root,600,400);
	    	stage.setScene(scene);
	        stage.setTitle("");
	        stage.show();
	      }
	    
	public static void main(String[] args) {
		 launch(args);

	}

}