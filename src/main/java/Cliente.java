package main.java;

import java.util.Scanner;

public class Cliente {
//	- Tarea 2 crear Clase Cliente con los atributos identificador, password
//  crear un registro de clientes en la clase CajeroEletronico con 5 clientes diferentes
//  modificar la ejecución del menu para que compruebe si el identificador introducido existe y después si la password es correcta.
// En caso erróneo se debe mostrar y volverá a empezar:

	int identificador;
	int password;
	double saldo = 5000;

	/**
	 * @param identificador de clientes para su posterior registro
	 * @param password      de clientes
	 */

	// CONSTRUCTOR DEL CLIENTE CON PASSWORD E IDENTIFICADOR
	public Cliente(int identificador, int password) {
		this.identificador = identificador;
		this.password = password;
		this.saldo =saldo;
	}

	/**
	 * MÉTODO GET PARA SABER EL SALDO DEL CLIENTE
	 * 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * MÉTODO PARA INGRESAR SALDO EN CLIENTES PASANDO COMO PARAMETO LA CANTIDAD DE
	 * TIPO DOUBLE
	 * 
	 * @param cantidad
	 */
	public void ingresarSaldo(double cantidad) {
		saldo += cantidad;
	}

	/**
	 * MÉTODO PARA VISUALIZAAR EL IDENTIFICADOR DEL CLIENTE, DONDE SE RETORTA DICHO
	 * ATRIBUTO
	 * 
	 * @return
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * TENEMOS TAMBIÉN MÉTODO SET PARA LA OBTENCIÓN DE IDENTIFICACIÓN DE CLIENTES
	 * 
	 * @param identificador
	 * @return
	 */
	public static Cliente setIdentificador(int identificador) {
		identificador = identificador;
		return null;
	}

	/**
	 * MÉTODO RELIZAR INGRESO DONDE PASAMOS COMO PARAMETRO NUESTRO CONSTRUCTOR CON
	 * SU RESPECTIVO OBJETO. DONDE PODEMOS PASAR TODA LA INFORMACIÓN RELACIONADA AL
	 * INGRESO DE DINERO
	 * 
	 * @param cliente
	 */
	public static void realizarIngreso(Cliente cliente) {
		Scanner sc = new Scanner(System.in);
		double saldo;
		System.out.println("Escribe cuanto deseas ingresar: ");
		saldo = sc.nextDouble();
		cliente.saldo = cliente.saldo + saldo;
		System.out.println("El saldo del cliente es " + "[" + cliente.saldo + "]");

	}

	/**
	 * MÉTODO PARA COMPROBAR CREDENCIALES DEL USUARIO EN ESTE CASO IDENTIFICADOR,
	 * DONDE RECORREMOS EN UN FOR TODOS LOS CLIENTES PARA ASÍ COMPROBRAR SÍ EXISTE
	 * EN NUESTRO ARRAY
	 * 
	 * @param cliente
	 * @param identificador
	 * @return
	 */
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

	/**
	 * COMPROBACIÓN DE CONTRASEÑA EN EL ARRAY RECORRIENDOLO
	 * 
	 * @param cliente
	 * @param password
	 * @return
	 */
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

	/**
	 * MÉTODO PARA HACER LA RETIRADA DEL DINERO, PASANDOLE EL DATO DE CANTIDAD
	 * 
	 * @param cantidad
	 */
	void restarCantidad(double cantidad) {
		saldo -= cantidad;
	}

	/**
	 * MÉTODO PARA SUMAR AL SALDO DEL USUARIO EL DATO INGRESADO
	 * 
	 * @param cantidad
	 */
	void sumarCantidad(double cantidad) {
		saldo += cantidad;
	}

	/**
	 * MÉTODO PARA TRANSFERIR DINERO ENTRE CLIENTES 1 Y 2, DE SER ASI DEBERRÍA
	 * IMPLEMENTARSE DE OTRA FORMA PARA HACER LA TRANSFERENCIA
	 * 
	 * @param c1
	 * @param c2
	 */

	public static void transferirImporte(Cliente c1, Cliente c2) {
		Scanner sc = new Scanner(System.in);
		double cantidad;
		System.out.println("Ingrese el monto que quiere transferir: ");

		cantidad = sc.nextDouble();
		c1.restarCantidad(cantidad);
		c2.sumarCantidad(cantidad);
		System.out.println("el monto que transfirió es: " + cantidad + " a la persona: " + c2.getIdentificador());
	}

	/**
	 * MÉTODO OVERRIDE PARA IMPRIMIR TODO LOS DATOS DEL CLIENTE
	 */
	@Override
	public String toString() {
		return "Clientes [identificador =" + identificador + ", password =" + password + "]";
	}

}
