package Clases;

import Recursos.Matematica;

public class Conversor {
	private String ingreso;
	private String egresoConvertido;
	private Sistemas sistemaDeIngreso;
	private Sistemas sistemaDeEgreso;
	private Matematica matematica;

	public Conversor(String ingreso, Sistemas sistemaDeIngreso, Sistemas sistemaDeEgreso) {
		setIngreso(ingreso);
		setEgreso();
		this.sistemaDeIngreso = sistemaDeIngreso;
		this.sistemaDeEgreso = sistemaDeEgreso;
		this.matematica = new Matematica();
	}

	public String getEgresoConvertido() {
		return egresoConvertido;
	}

	private void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}

	public void setEgreso() {
		this.egresoConvertido = obtenerEgreso();
	}

	private String obtenerEgreso() {

		return "Estamos trabajando: #QuedateEnCasa";
	}

	public void convertirDeDecimalABinario() {
		int ingresoComoEntero = Integer.parseInt(this.ingreso);
		int nuevoDividendo = ingresoComoEntero;

		while (matematica.divisionEnteraPorLaMitad(ingresoComoEntero) >= 2) {
			this.egresoConvertido = matematica.obtenerResto(2, nuevoDividendo) + this.egresoConvertido;
			nuevoDividendo = matematica.divisionEnteraPorLaMitad(nuevoDividendo);
		}

	}

}
