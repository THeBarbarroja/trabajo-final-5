package app.controller;

import app.model.Alumno;

import app.service.AlumnoService;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AlumnosController {
	@FXML private TextField txtAlumno;
	@FXML private TextField txtEdad;
	@FXML private Label lblError;
	@FXML private TableView<Alumno> tablaAlumnos;
	AlumnoService serviceAlumnoService= new AlumnoService();
	@FXML
	public void initialize() {
		TableColumn<Alumno, String> colNombre = new TableColumn<>("Nombre");
	    TableColumn<Alumno, Integer> colEdad = new TableColumn<>("Edad");
	    
	    colNombre.setCellValueFactory(data ->
		new SimpleStringProperty(data.getValue().getNombre()));
	    
	    colEdad.setCellValueFactory(data ->
		new SimpleIntegerProperty(data.getValue().getEdad()).asObject());
	
	    tablaAlumnos.getColumns().addAll(colNombre,colEdad);
	    tablaAlumnos.setItems(serviceAlumnoService.devolverLista());

}
	@FXML
	public void agregar() {
		try {
			serviceAlumnoService.agregar(txtAlumno.getText(),txtEdad.getText());
        	 txtAlumno.clear();
        	 txtEdad.clear();
        }catch(Exception ex) {
        	lblError.setText("ERROR: "+ex.getMessage());

        }
	  };	
	  @FXML
	  public void eliminar() {
		  Alumno seleccionado=tablaAlumnos.getSelectionModel().getSelectedItem();
		  if(seleccionado!= null ) {
			  serviceAlumnoService.eliminar(seleccionado);
	  }
	  };  
	@FXML
	 public void volver() {
		Navigation.cambiar("/app/view/menu.fxml");
	}
};
  
