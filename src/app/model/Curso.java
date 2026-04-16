package app.model;

public class Curso {
	private String nombre;
	private double horas;
	public Curso(String nombre, double horas) {
		this.nombre = nombre;
		this.horas = horas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	

}
