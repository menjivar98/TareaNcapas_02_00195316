package com.uca.capas.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Articulo {
	@Size(min = 12, max = 12, message ="El numero de codigo tiene que ser exacto a 12")
	private String codigo;
	@Size(min = 1, max = 100, message ="El nombre de producto tiene que tener como minimo 1 caracter y como maximo 100 caracteres")
	private String nombre;
	@Size(min = 1, max = 100, message ="La marca tiene que tener como minimo 1 caracter y como maximo 100 caracters")
	private String marca;
	@Size(min = 1, max = 500, message ="La descripcion tiene que tener 500 caracteres")
	private String descripcion;
	@Size(min = 1, max = 100, message ="El campo existencias no puede estar vacio")
	private String existencias;
	
	@NotEmpty(message="La fecha esta vacía")
	@Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$",message = "La fecha no cumple con el formato dd/mm/yyyy")
	private String date;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	
	
	
	
}
