package main;

import java.util.Scanner;
import Clases.Alumno;

public class Main {

	public static void main(String[] args) {
		proccesAlumno(5);
	}
	
	
	private static void proccesAlumno(int numeroAlumno) {
		Scanner scanner = new Scanner(System.in);
		
		Alumno currentAlumno = new Alumno();
		//get input
		System.out.println("Ingrese el Nombre del alumno");
		currentAlumno.setNombre(scanner.nextLine());
		System.out.println("Ingrese el Legajo del alumno");
		currentAlumno.setLegajo(scanner.nextLine());
		System.out.println("Ingrese el Apellido del alumno");
		currentAlumno.setApellido(scanner.nextLine());
		System.out.println("Ingrese la nota de lengua del alumno");
		currentAlumno.setNotaDeLengua(scanner.nextInt());
		System.out.println("Ingrese la nota de Matematica del alumno");
		currentAlumno.setNotaDeMatematica(scanner.nextInt());
		System.out.println("Ingrese la nota de Programacion del alumno");
		currentAlumno.setNotaDeProgramacion(scanner.nextInt());
		
		

		
		//repeat
		if (numeroAlumno > 1) {
			proccesAlumno(numeroAlumno - 1);
		}
			
		
		//set output
		System.out.println(
				"Nombre del Alumno: " + currentAlumno.getNombre() + 	
				"\nLegajo del Alumno: " + currentAlumno.getLegajo() +
				"\nApellido del Alumno: " + currentAlumno.getApellido() +
				"\nNota de lengua del Alumno: " + currentAlumno.getNotaDeLengua() +
				"\nNota de matematicas del Alumno: " + currentAlumno.getNotaDeMatematica() +
				"\nNota de programacion del Alumno: " + currentAlumno.getNotaDeProgramacion() +
				"\nPromedio del Alumno: " + Math.round(currentAlumno.getPromedio()) +
				"\n"
				);
		if (currentAlumno.getPromedio() < 6) {
			System.out.println("El alumno no esta aprobado\n");
		} else if (currentAlumno.getPromedio() > 9) {
			System.out.println("Es un alumno destacado\n");
		}
		// (5 + 12 + 12) / 3 = 9.67  
		if (currentAlumno.getNotaDeLengua() < 6 || currentAlumno.getNotaDeMatematica() < 6 || currentAlumno.getNotaDeProgramacion() < 6) {
			System.out.println("El alumno tiene materias sin aprobar\n");
		}
		
		scanner.close();
	}
}
