package System;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Sistema {
	private List<Profesor> profesores;
	private Gson gson;
	private Scanner leer;
	
	public Sistema() {
		profesores = new ArrayList<>();
		gson = new GsonBuilder().setPrettyPrinting().create();
		leer = new Scanner(System.in);
	}
	
	public void agregarProfesor(Profesor profesor) {
		profesores.add(profesor);
	}
	
	public Profesor obtenerProfesor(int idProfesor) {
	        for (Profesor profesor : profesores) {
	            if (profesor.getId() == idProfesor) {
	                return profesor;
	            }
	        }
	        return null;
	    }
	
	public int calcularAlumnos() {
		int cantidad = 0;
		for (Profesor p : profesores) {
			cantidad += p.getAlumnosAsignados().size();
		}
		return cantidad;
	}
	
	 public void guardarEnArchivo(String nombreArchivo) {
	        try (FileWriter writer = new FileWriter(nombreArchivo)) {
	            gson.toJson(profesores, writer);
	    		for(int i = 0; i < profesores.size(); i++) {
	    			System.out.println(profesores.get(i).getNombre());
	    		}
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 }
	 
	 public void cargarDesdeArchivo(String nombreArchivo) {
	        try (FileReader reader = new FileReader(nombreArchivo)) {
	            Type profesorListType = new TypeToken<List<Profesor>>(){}.getType();
	            profesores = gson.fromJson(reader, profesorListType);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public void Menu() {
	        System.out.println("Sistema de Profesores y Alumnos");
	        System.out.println("Seleccione una opción:");
	        System.out.println("1. Agregar Profesor");
	        System.out.println("2. Asignar alumno a profesor");
	        System.out.println("3. Calcular cantidad de alumnos asignados a profesores");
	        System.out.println("4. Salir");
	    }
	 
	 
}
