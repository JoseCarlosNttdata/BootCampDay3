package com.nttdata.bootcamp.model;

public class Temperatura {
	private final String CELSIUS = "CELSIUS";
	private final String FARENHEIT = "FARENHEIT";
	private String tipo;
	
	public Temperatura(String tipo) {
		this.tipo = String.valueOf(tipo.toUpperCase());
	}

	public double convertTo(String temperatura) {
		return ("CELSIUS".equals(this.CELSIUS)) ? (Double.parseDouble(temperatura)-32)/1.8 : (Double.parseDouble(temperatura)*1.8)+32;
	}
}
