package System;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Sistema sistema = new Sistema();
		sistema.cargarDesdeArchivo("profesores.json");
		int opcion;
		
		do {
			sistema.Menu();
			Scanner leer = new Scanner(System.in);
			opcion = leer.nextInt();
			leer.nextLine();
			
			
			switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del Profesor: ");
                String nombreProfesor = leer.nextLine();
                System.out.print("Apellido del Profesor: ");
                String apellidoProfesor = leer.nextLine();
                System.out.print("ID del Profesor: ");
                int idProfesor = leer.nextInt();
                leer.nextLine();
                System.out.print("Materia que da el Profesor: ");
                String materiaProfesor = leer.nextLine();
                Profesor nuevoProfesor = new Profesor(idProfesor, nombreProfesor, apellidoProfesor, materiaProfesor);
                sistema.agregarProfesor(nuevoProfesor);
                System.out.println("Profesor agregado con éxito.");
                break;
            case 2:

                System.out.print("ID del Profesor a asignar: ");
                int idProfesorAsignado = leer.nextInt();
                leer.nextLine();
                Profesor profesorAsignado = sistema.obtenerProfesor(idProfesorAsignado);
                if (profesorAsignado != null) {
                    System.out.print("Nombre del Alumno: ");
                    String nombreAlumno = leer.nextLine();
                    System.out.print("Apellido del Alumno: ");
                    String apellidoAlumno = leer.nextLine();
                    System.out.print("Grado del Alumno: ");
                    int grado = leer.nextInt();
                    int legajo = 1;
                    Alumno nuevoAlumno = new Alumno(legajo, nombreAlumno, apellidoAlumno, grado);
                    profesorAsignado.asignarAlumno(nuevoAlumno);
                    System.out.println("Alumno asignado con éxito.");
                } else {
                    System.out.println("No se encontró el Profesor con el ID especificado.");
                }
                break;
            case 3:

                int totalAlumnosAsignados = sistema.calcularAlumnos();
                System.out.println("Cantidad total de Alumnos asignados: " + totalAlumnosAsignados);
                break;
            case 4:
                // Salir del programa
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una opción válida.");
                break;
        }
			
		} while (opcion != 4);
		
		sistema.guardarEnArchivo("profesores.json");
	}
}
