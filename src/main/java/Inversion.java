package main.java;

<<<<<<< HEAD
import java.util.Random;

public class Inversion {
	int cantidad;
	String nombre;

	public Inversion(int cantidad, String nombre) {
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

	public double obtenerBeneficios() {
		Random rnd = new Random();

		double aleatorio = 0.05 + (0.05 - 0.75) * rnd.nextDouble();

		if (rnd.nextBoolean()) {
			return cantidad + aleatorio;
		} else {
			return -cantidad + aleatorio;
		}

	}
=======
public class Inversion {

	private String nombre;
	private double cantidad;

	// Constructor
	public Inversion(String nombre, double cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
>>>>>>> refs/remotes/origin/master

}
