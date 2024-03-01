package main.java;

import java.util.Scanner;

public class BancoElectronico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcionMenu = ' ';
		int identificadorCliente = 0;

		Cliente[] clientes = new Cliente[5];
		clientes[0] = new Cliente(123456, 123456);
		clientes[1] = new Cliente(98620, 1234);
		clientes[2] = new Cliente(123, 12345);
		clientes[3] = new Cliente(12, 123);
		clientes[4] = new Cliente(12345, 1234);

		identificadorCliente = autenticarCliente(clientes);
		
		while (identificadorCliente != 0) {
			mostrarMenu();
			opcionMenu = sc.nextLine().toUpperCase().charAt(0);

			switch (opcionMenu) {
			case 'A':
				Cliente.mostrarSaldoCliente(clientes, identificadorCliente);
				break;
			case 'B':
				Cliente.ingresarSaldoCliente(clientes, identificadorCliente);
				break;
			case 'C':
				Cliente.retirarSaldoCliente(clientes, identificadorCliente);
				break;
			case 'D':
				Cliente.transferenciaClientes(clientes, identificadorCliente);
				break;
			case 'E':
				// Agregar lógica para añadir inversión
				break;
			case 'F':
				// Agregar lógica para eliminar inversión
				break;
			case 'G':
				// Agregar lógica para comprobar inversiones
				break;
			case 'H':
				System.out.println("Saliendo...");
				identificadorCliente = autenticarCliente(clientes);
				break;
			default:
				System.out.println("Opción incorrecta, seleccione una letra correspondiente del menú [A-H]");
			}
		}

		sc.close();
	}

	public static int autenticarCliente(Cliente[] clientes) {
		Scanner sc = new Scanner(System.in);
		int identificadorCliente = 0;
		int identificadorIngresado;
		int password;

		System.out.println("Ingrese su identificador de cliente: ");
		identificadorIngresado = sc.nextInt();

		for (Cliente cliente : clientes) {
			if (cliente.getIdentificador() == identificadorIngresado) {
				System.out.println("Ingrese su contraseña: ");
				password = sc.nextInt();

				if (cliente.getPassword() == password) {
					System.out.println("Bienvenido " + identificadorIngresado);
					identificadorCliente = identificadorIngresado;
				} else {
					System.out.println("Contraseña incorrecta");
				}
				break;
			}
		}

		if (identificadorCliente == 0) {
			System.out.println("El identificador no existe");
		}

		sc.nextLine(); // Limpiar el buffer del scanner
		return identificadorCliente;
	}

	public static void mostrarMenu() {
		System.out.println("Menú de opciones: ");
		System.out.println("A. Mostrar saldo actual");
		System.out.println("B. Ingresar importe");
		System.out.println("C. Obtener importe");
		System.out.println("D. Transferir importe");
		System.out.println("E. Añadir Inversión");
		System.out.println("F. Eliminar Inversión");
		System.out.println("G. Comprobar Inversiones");
		System.out.println("H. Salir");
	}
}