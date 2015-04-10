package com.clases;

import java.util.Date;

public class Venta {

	private int id;
	private PrendaBase prenda;
	private int cantidad;
	private Date fecha;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PrendaBase getPrenda() {
		return prenda;
	}

	public void setPrenda(PrendaBase prenda) {
		this.prenda = prenda;
	}

	public int getCantidadPrendas() {
		return cantidad;
	}

	public void setCantidadPrendas(int cantidadPrendas) {
		this.cantidad = cantidadPrendas;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public double getPrecioTotalVenta() {
		double valorVenta = prenda.getPrecioFinal() * cantidad;
		
		return valorVenta;
	}

}
