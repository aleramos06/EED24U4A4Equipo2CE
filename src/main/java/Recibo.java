package main.java;

import java.util.Random;

public class Recibo {
	
	int cantidad;
	String nombre;

	public Recibo(int cantidad, String nombre) {
		super();
		this.cantidad = cantidad;
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

	public boolean pagarRecibos() {
		Random rnd = new Random();
		int numero = rnd.nextInt(4) + 1;

		if (numero == 1) {
			return true;
		} else {
			return false;
		}

	}
}
