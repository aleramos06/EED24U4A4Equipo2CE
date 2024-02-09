package parte1;

import java.util.Scanner;

public class Cliente {
//	- Tarea 2 crear Clase Cliente con los atributos identificador, password
//    crear un registro de clientes en la clase CajeroEletronico con 5 clientes diferentes
//    modificar la ejecución del menu para que compruebe si el identificador introducido existe y después si la password es correcta.
//   En caso erróneo se debe mostrar y volverá a empezar:

	int identificador;
	int password;
	double saldo;

	/**
	 * @param identificador
	 * @param password
	 */
	public Cliente(int identificador, int password) {
		this.identificador = identificador;
		this.password = password;
	}

	public double getSaldo() {
		return saldo;
	}

	public void ingresarSaldo(double cantidad) {
		saldo += cantidad;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public static void realizarIngreso(Cliente cliente) {
		Scanner sc = new Scanner(System.in);
		double saldo;
		System.out.println("Escribe cuanto deseas ingresar: ");
		saldo = sc.nextDouble();
		cliente.saldo = cliente.saldo + saldo;
		System.out.println("El saldo del cliente es " + "[" + cliente.saldo + "]");

	}

	public static boolean comprobarIdentificador(Cliente[] cliente, int identificador) {
		boolean correcto = false;
		for (int i = 0; i < cliente.length; i++) {
			if (cliente[i].identificador == identificador) {
				correcto = true;
				return correcto;
			}

		}
		return correcto;
	}

	public static boolean comprobarPassword(Cliente[] cliente, int password) {
		boolean correcto = false;
		for (int i = 0; i < cliente.length; i++) {
			if (cliente[i].password == password) {
				correcto = true;
				return correcto;

			}

		}
		return correcto;
	}

	void restarCantidad(double cantidad) {
		saldo -= cantidad;
	}

	void sumarCantidad(double cantidad) {
		saldo += cantidad;
	}

	public static void transferirImporte(Cliente c1, Cliente c2) {
		Scanner sc = new Scanner(System.in);
		double cantidad;
		System.out.println("Ingrese el monto que quiere transferir: ");

		cantidad = sc.nextDouble();
		c1.restarCantidad(cantidad);
		c2.sumarCantidad(cantidad);
		System.out.println("el monto que transfirió es: " + cantidad + " a la persona: " + c2.getIdentificador());
	}

	@Override
	public String toString() {
		return "Clientes [identificador =" + identificador + ", password =" + password + "]";
	}

}
