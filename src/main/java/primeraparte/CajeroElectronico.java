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
		char menu = ' ';
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
		sc.nextLine();

		while (noExiste) {
			System.out.println("Menú de opciones: ");
			System.out.println("A. Mostrar saldo actual");
			System.out.println("B. Ingresar importe");
			System.out.println("C. Obtener importe");
			System.out.println("D. Transferir importe");
			System.out.println("E. Salir");
			
			menu = sc.nextLine().toUpperCase().charAt(0);

		
			switch (menu) {
			case 'A':
				System.out.println("el saldo es :" +	clientes[0].getSaldo());
				break;
			case 'B':
				Cliente.realizarIngreso(clientes[0]);
				break;
			case 'C':
				break;
			case 'D':
				Cliente.transferirImporte(clientes[0],clientes[1]);				
				break;
			case 'E':
				System.out.println("Salir");
				break;
			default:
				System.out.println("Opción incorrecta, seleccione un número");
			}
		}

	}

}
