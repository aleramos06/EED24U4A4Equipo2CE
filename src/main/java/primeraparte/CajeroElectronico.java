package primeraparte;

import java.util.Scanner;

public class CajeroElectronico {

	String identificadorCliente;
	int password;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String identificadorCliente = " ";
		String password;
		int menu = 0;
		final int cliente = 5;
		final int contraseña = 5;

		String[][] clientes = new String[cliente][contraseña];

		System.out.println("Ingrese su identificador de cliente: ");
		identificadorCliente = sc.nextLine();
		System.out.println("Ingrese su contraseña: ");
		password = sc.nextLine();
		System.out.println("Bienvenido " + identificadorCliente);
		

		do {
			System.out.println("Menú de opciones: ");
			System.out.println("1. Mostrar saldo actual");
			System.out.println("2. Ingresar importe");
			System.out.println("3. Obtener importe");
			System.out.println("4. Transferir importe");
			System.out.println("0. Salir");

			menu = sc.nextInt();

			switch (menu) {
			case 1:
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
		} while (menu != 0);

	}

}
