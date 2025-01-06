package System;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
	private int id;
	private String nombre;
	private String apellido;
	private String materia;
	private List<Alumno> alumnosAsignados;
	
	public Profesor(int id, String nombre, String apellido, String materia) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.materia = materia;
		this.alumnosAsignados = new ArrayList<>();
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void asignarAlumno(Alumno alumno) {
		if (alumnosAsignados.size() < 10) {
			alumnosAsignados.add(alumno);
		} else {
			System.out.println("el numero de alumnos asignados ya llego a su limite");
		}
	}
	
	public List<Alumno> getAlumnosAsignados() {
		return alumnosAsignados;
	}
	
}
