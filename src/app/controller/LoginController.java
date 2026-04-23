package app.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML private TextField txtUsuario;
	@FXML private PasswordField txtClave;
	@FXML private Label lblError;
	
	@FXML
	public void ingresar() {
		if (txtUsuario.getText().equals("admin")&& txtClave.getText().equals("1234")) {
            Navigation.cambiar("/app/view/menu.fxml");

        } else {
            lblError.setText("Datos incorrectos.Ingrese usuario o contraseña nuevamente");
        }
    }
}