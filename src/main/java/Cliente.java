package main.java;

import java.util.Random;
import java.util.Scanner;

public class Cliente {
//	- Tarea 2 crear Clase Cliente con los atributos identificador, password
//  crear un registro de clientes en la clase CajeroEletronico con 5 clientes diferentes
//  modificar la ejecución del menu para que compruebe si el identificador introducido existe y después si la password es correcta.
// En caso erróneo se debe mostrar y volverá a empezar:

	int identificador;
	int password;
	double monedero;
	Inversion[] inversiones;
	int numInversiones;

	/**
	 * @param identificador de clientes para su posterior registro
	 * @param password      de clientes
	 */

	// CONSTRUCTOR DEL CLIENTE CON PASSWORD E IDENTIFICADOR
	public Cliente(int identificador, int password) {
		this.identificador = identificador;
		this.password = password;
		this.monedero = numeroAleatorio(1000, 20000);
		this.inversiones = new Inversion[10]; // Por ejemplo, un array de tamaño 10
		this.numInversiones = 0;
	}

	public void agregarInversion(Inversion inversion) {
		if (numInversiones < inversiones.length) {
			inversiones[numInversiones] = inversion;
			numInversiones++;
		} else {
			System.out.println("No se pueden agregar más inversiones. El límite ha sido alcanzado.");
		}
	}

	public void eliminarInversion(int indice) {
		if (indice >= 0 && indice < numInversiones) {
			for (int i = indice; i < numInversiones - 1; i++) {
				inversiones[i] = inversiones[i + 1];
			}
			inversiones[numInversiones - 1] = null;
			numInversiones--;
		} else {
			System.out.println("Índice de inversión inválido.");
		}
	}
	public boolean tieneInversiones() {
	    return numInversiones > 0;
	}

	public Inversion[] getInversiones() {
	    return inversiones;
	}
	private void comprobarInversiones(Cliente cliente) {
	    if (cliente.tieneInversiones()) {
	        Inversion[] inversiones = cliente.getInversiones();
	        for (Inversion inversion : inversiones) {
	            double cantidadAnterior = inversion.getCantidad();
	            double coeficienteInversion = inversion.obtenerBeneficios() / cantidadAnterior;
	            double cantidadResultante = inversion.obtenerCantidadConBeneficios();
	            System.out.println("Inversion: " + inversion.getNombre());
	            System.out.println("Cantidad anterior: " + cantidadAnterior);
	            System.out.println("Coeficiente de inversión: " + coeficienteInversion);
	            System.out.println("Cantidad resultante: " + cantidadResultante);
	        }
	    } else {
	        System.out.println("El cliente no tiene inversiones.");
	    }
	}

	private double numeroAleatorio(int min, int max) {
		Random rnd = new Random();
		double saldoMonedero = rnd.nextDouble(min, max);

		return saldoMonedero;
	}

	/**
	 * MÉTODO GET PARA SABER EL SALDO DEL CLIENTE
	 * 
	 * @return
	 */
	public double getMonedero() {
		return monedero;
	}

	/**
	 * MÉTODO PARA INGRESAR SALDO EN CLIENTES PASANDO COMO PARAMETO LA CANTIDAD DE
	 * TIPO DOUBLE
	 * 
	 * @param cantidad
	 */
	public void ingresarSaldo(double cantidad) {
		monedero += cantidad;
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
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
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
		cliente.monedero = cliente.monedero + saldo;
		System.out.println("El saldo del cliente es " + "[" + cliente.monedero + "]");

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
		monedero -= cantidad;
	}

	/**
	 * MÉTODO PARA SUMAR AL SALDO DEL USUARIO EL DATO INGRESADO
	 * 
	 * @param cantidad
	 */
	void sumarCantidad(double cantidad) {
		monedero += cantidad;
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
