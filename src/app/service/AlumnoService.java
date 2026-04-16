package app.service;
import app.model.Alumno;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AlumnoService {
		private ObservableList<Alumno>listaAlumnos= FXCollections.observableArrayList();
	public void agregar(String nombre, String edadTexto) {
		
		if(nombre.isEmpty()) {
			throw new IllegalArgumentException("Nombre no puede estar vacio");
		}
		if (edadTexto.isEmpty()) {
			throw new IllegalArgumentException("Edad no puede estar vacio");
		}
		int edad;
		try {
			edad=Integer.parseInt(edadTexto);
		}catch(NumberFormatException e) {
			throw new IllegalArgumentException("Edad debe ser un numero entero");
		}
		if(edad<=0) {
			throw new IllegalArgumentException("Edad no puede ser menos de 0");
		}
		Alumno alumno =new Alumno(nombre,edad);
		listaAlumnos.add(alumno);
		
	}
	public void eliminar(Alumno alumno) {
		listaAlumnos.remove(alumno);
		
	}

}
