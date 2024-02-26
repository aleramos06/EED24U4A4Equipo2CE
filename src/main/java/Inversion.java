package main.java;

import java.util.Random;

public class Inversion {
	private int cantidad;
	private String nombre;

	public Inversion(int cantidad, String nombre) {
		super();
		this.setCantidad(cantidad);
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double obtenerBeneficios() {
		Random rnd = new Random();

		double aleatorio = 0.05 + (0.05 - 0.75) * rnd.nextDouble();

		if (rnd.nextBoolean()) {
			return getCantidad() + aleatorio;
		} else {
			return -getCantidad() + aleatorio;
		}

	}
}