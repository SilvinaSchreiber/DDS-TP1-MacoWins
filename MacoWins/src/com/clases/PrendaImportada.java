package com.clases;

/**
 * para heredar se utiliza extends y seguido la clase a la que se quiere heredar
 */
public class PrendaImportada extends PrendaBase {

	private double tasa = 1.5;
	
	@Override // sobreescribe el metodo del padre
	public double getPrecioFinal() {
		double PrecioImportado = precio * tasa;
		
		return PrecioImportado;
	}
	
}
