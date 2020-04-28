package com.uca.capas.domain;

import java.sql.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

public class Usuario {
	@Size(min = 1, max = 30, message ="El nombre tiene que tener como minimo 1 caracter y como maximo 30 caracters")
	private String nombre;
	@Size(min = 1, max = 30, message ="El apellido tiene que tener como minimo 1 caracter y como maximo 30 caracters")
	private String apellido;
	
	
	private String fecha;
	
	@Size(min = 1, max = 25, message ="El lugar de nacimiento tiene que tener como minimo 1 caracter y como maximo 25 caracters")
	private String nacimiento;
	
	@Size(min = 1, max = 100, message ="El campo Instuto tiene que tener como minimo 1 caracter y como maximo 100 caracters")
	private String Instuto;
	
	@Size(min = 8 , max= 8, message = "El campo telefono tiene que tener 8 caracteres exacto")
	private String telefono;
	
	@Size(min = 8 , max= 8, message = "El campo movil tiene que tener 8 caracteres exacto")
	private String movil;
	
	
	
	
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	
	public String getInstuto() {
		return Instuto;
	}
	public void setInstuto(String instuto) {
		Instuto = instuto;
	}
	
}
