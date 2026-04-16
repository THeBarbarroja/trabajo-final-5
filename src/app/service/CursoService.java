package app.service;
import app.model.Curso;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CursoService {
	private ObservableList<Curso>listaCurso= FXCollections.observableArrayList();
	public void agregar(String nombre, String horasTexto) {
		if(nombre.isEmpty()) {
			throw new IllegalArgumentException("Nombre no puede estar vacio");
		}
		if (horasTexto.isEmpty()) {
			throw new IllegalArgumentException("Edad no puede estar vacio");
		}
		double horas;
		try {
			horas=Integer.parseInt(horasTexto);
		}catch(NumberFormatException e) {
			throw new IllegalArgumentException("horas debe ser un numero entero");
		}
		if(horas<=0) {
			throw new IllegalArgumentException("horas no puede ser menos de 0");
		}
		Curso curso = new Curso(nombre,horas);
		listaCurso.add(curso);
		
	}
	public void eliminar(Curso curso) {
		listaCurso.remove(curso);
	
	}
	
}

