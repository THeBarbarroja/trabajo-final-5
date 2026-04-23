package app.controller;

import javafx.fxml.FXML;

public class MenuController {
	@FXML
	public void gestorAlumnos() {
		 Navigation.cambiar("/app/view/alumnos.fxml");
	}
	@FXML
	public void gestorCursos() {
		Navigation.cambiar("/app/view/cursos.fxml");
	}
	@FXML
	public void cerrar() {
		Navigation.cambiar("/app/view/login.fxml");
	}
}
