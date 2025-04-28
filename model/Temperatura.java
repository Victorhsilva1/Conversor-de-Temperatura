package br.dev.victorhugo.conversor_temperatura.model;



public class Temperatura {
	
	private double celsius;

	
	//getters e setters
	public double getCelsius() {
		return celsius;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	
//	celsius para kelvin
	public double converterParaKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	
//	celsius para fahreinheit
	public double converterParaFahreinheit() {
		double fahreinheit = (celsius * 1.8) + 32;
		return fahreinheit;
	}
	
	
	
}