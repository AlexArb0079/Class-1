package Clases;

public class Alumno {
	
	private String Nombre;
	private String Apellido;
	private String Legajo;
	private int NotaDeMatematica;
	private int NotaDeLengua;
	private int NotaDeProgramacion;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getLegajo() {
		return Legajo;
	}
	public void setLegajo(String legajo) {
		Legajo = legajo;
	}
	public int getNotaDeMatematica() {
		return NotaDeMatematica;
	}
	public void setNotaDeMatematica(int notaDeMatematica) {
		NotaDeMatematica = notaDeMatematica;
	}
	public int getNotaDeLengua() {
		return NotaDeLengua;
	}
	public void setNotaDeLengua(int notaDeLengua) {
		NotaDeLengua = notaDeLengua;
	}
	public int getNotaDeProgramacion() {
		return NotaDeProgramacion;
	}
	public void setNotaDeProgramacion(int notaDeProgramacion) {
		NotaDeProgramacion = notaDeProgramacion;
	}
	public double getPromedio() {
		return (NotaDeMatematica + NotaDeLengua + NotaDeProgramacion) / 3.0;
	}
	
	
}
