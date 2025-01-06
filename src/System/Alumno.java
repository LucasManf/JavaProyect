package System;

public class Alumno {
	private int legajo;
	private String nombre;
	private String apellido;
	private int grado;
	
	public Alumno(int legajo, String nombre, String apellido, int grado) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.grado = grado;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}
}
