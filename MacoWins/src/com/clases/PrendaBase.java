package com.clases;

public class PrendaBase {
	protected int identificador;
	protected String descripcion;
	protected double valorFijoNegocio = 2;
	protected double precioBase = 300;
	protected double precio = precioBase * valorFijoNegocio;
	
	public int getId() {
		return identificador;
	}

	public void setId(int id) {
		this.identificador = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precioBase;
	}

	public void setPrecio(double precio) {
		this.precioBase = precio;
	}

	public double getPrecioFinal(){
		return precio;
	}
	
}
