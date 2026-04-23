package app.model;

public class Curso {
	private String nombre;
	private int horas;
	public Curso(String nombre, int horas) {
		this.nombre = nombre;
		this.horas = horas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	

}
