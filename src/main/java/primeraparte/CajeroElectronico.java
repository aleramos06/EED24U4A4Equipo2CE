package primeraparte;

import java.util.Iterator;
import java.util.Scanner;

import parte1.Cliente;

public class CajeroElectronico {

	String identificadorCliente;
	int password;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int identificadorCliente;
		int password;
		int menu = 0;
		boolean noExiste = false;

		Cliente[] clientes = new Cliente[5];

		clientes[0] = new Cliente(123456, 123456);
		clientes[1] = new Cliente(98620, 1234);
		clientes[2] = new Cliente(123, 12345);
		clientes[3] = new Cliente(12, 123);
		clientes[4] = new Cliente(12345, 1234);

		System.out.println("Ingrese su identificador de cliente: ");
		identificadorCliente = sc.nextInt();
		if (Cliente.comprobarIdentificador(clientes, identificadorCliente)) {
			System.out.println("Ingrese su contraseña: ");
			password = sc.nextInt();
			if (Cliente.comprobarPassword(clientes, password)) {
				System.out.println("Bienvenido " + identificadorCliente);
				noExiste = true;
			} else {
				System.out.println("Contraseña incorrecta");
			}

		} else {
			System.out.println("El identificador no existe");
		}

		while (noExiste) {
			System.out.println("Menú de opciones: ");
			System.out.println("1. Mostrar saldo actual");
			System.out.println("2. Ingresar importe");
			System.out.println("3. Obtener importe");
			System.out.println("4. Transferir importe");
			System.out.println("0. Salir");

			menu = sc.nextInt();

			switch (menu) {
			case 1:
			Cliente.realizarIngreso(clientes[0], 100);
				break;
			case 2:
				break;
			case 3:
				break;
			case 0:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Opción incorrecta, seleccione un número");
			}
		}

	}

}
