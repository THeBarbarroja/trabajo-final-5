package app.controller;

import app.model.Curso;
import app.service.CursoService;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CursoController {
	@FXML private TextField txtCurso;
	@FXML private TextField txtHoras;
	@FXML private Label lblError;
	@FXML private TableView<Curso> tablaCursos;
	CursoService serviceCursoService= new CursoService();
	@FXML
	public void initialize() {
		TableColumn<Curso, String> colCurso = new TableColumn<>("Curso");
	    TableColumn<Curso, Integer> colHoras = new TableColumn<>("Horas");
	    
	    colCurso.setCellValueFactory(data ->
		new SimpleStringProperty(data.getValue().getNombre()));
	    
	    colHoras.setCellValueFactory(data ->
		new SimpleIntegerProperty(data.getValue().getHoras()).asObject());
	
	    tablaCursos.getColumns().addAll(colCurso,colHoras);
	    tablaCursos.setItems(serviceCursoService.devolverLista());

}
	@FXML
	public void agregar() {
		try {
			serviceCursoService.agregar(txtCurso.getText(),txtHoras.getText());
			txtCurso.clear();
			txtHoras.clear();
        }catch(Exception ex) {
        	lblError.setText("ERROR: "+ex.getMessage());

        }
	  };	
	  @FXML
	  public void eliminar() {
		  Curso seleccionado=tablaCursos.getSelectionModel().getSelectedItem();
		  if(seleccionado!= null ) {
			  serviceCursoService.eliminar(seleccionado);
	  }
	  };  
	@FXML
	 public void volver() {
		Navigation.cambiar("/app/view/menu.fxml");
	}
};


