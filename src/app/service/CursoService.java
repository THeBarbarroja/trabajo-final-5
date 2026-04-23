package app.service;
import app.model.Curso;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CursoService {
	private static ObservableList<Curso>listaCurso= FXCollections.observableArrayList();
	public void agregar(String nombre, String horasTexto) {
		if(nombre.isEmpty()) {
			throw new IllegalArgumentException("Curso no puede estar vacio");
		}
		if (horasTexto.isEmpty()) {
			throw new IllegalArgumentException("horas no puede estar vacio");
		}
		int horas;
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
	public ObservableList<Curso>devolverLista(){
		return listaCurso;
		
	}
}

