package primeraparte;

import java.util.Scanner;

public class CajeroElectronico {
		
	
/**
 * CREACIÓN DE LA CLASE CAJEROELECTRONICO
 * CON ATRIBUNOS DE IDENTIFICADOR DE CLIENTE Y PASSWORD 
 */
	int identificadorCliente;
	int password;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int identificadorCliente;
		int password;
		char menu = ' ';
		boolean isCliente = false;

		/**
		 * ARRAY CON LOS 5 CLIENTES Y ABAJO DECLARADOS CON SU RESPECTIVO ID Y PASSWORD
		 */
		
		Cliente[] clientes = new Cliente[5];

		clientes[0] = new Cliente(123456, 123456);
		clientes[1] = new Cliente(98620, 1234);
		clientes[2] = new Cliente(123, 12345);
		clientes[3] = new Cliente(12, 123);
		clientes[4] = new Cliente(12345, 1234);

		
		/**
		 * EMPEZAMOS PIDIENDO ID Y COMPROBABMOS CON EL MÉTODO COMPROBARIDENTIFCADOR SÍ EXISTE.
		 * SÍ COINCIDE CON ALGUNO DE LOS ID PEDIMOS PASSWORD, Y TAMBIÉN COMPROBAMOS PASSWORD CON EL MÉTODO
		 */
/**
 * LIMPIAMOS BUFFER Y SEGUIDO DE ESTO, PASAMOS A IMPRIMIR NUESTRO MENÚ DONDE EL USUARIO PODRÁ REALIZAR LAS DIVERSAS
 * FUNCIONES.
 */
		while (isCliente) {
			System.out.println("Menú de opciones: ");
			System.out.println("A. Mostrar saldo actual");
			System.out.println("B. Ingresar importe");
			System.out.println("C. Obtener importe");
			System.out.println("D. Transferir importe");
			System.out.println("E. Salir");

			menu = sc.nextLine().toUpperCase().charAt(0);

			switch (menu) {
			case 'A':
				System.out.println("el saldo es :" + clientes[0].getSaldo());
				break;
			case 'B':
				Cliente.realizarIngreso(clientes[0]);
				break;
			case 'C':
				
				break;
			case 'D':
				Cliente.transferirImporte(clientes[0], clientes[1]);
				break;
			case 'E':
				System.out.println("Salir");
				menuClaves();
				break;
			default:
				System.out.println("Opción incorrecta, seleccione una letra correspodiente del menú [A-B-C-D-E]");
			}

		}

		sc.close();
	}
	
	public  void menuClaves() {

		System.out.println("Ingrese su identificador de cliente: ");
		identificadorCliente = sc.nextInt();
		if (Cliente.comprobarIdentificador(clientes, identificadorCliente)) {
			System.out.println("Ingrese su contraseña: ");
			password = sc.nextInt();
			if (Cliente.comprobarPassword(clientes, password)) {
				System.out.println("Bienvenido " + identificadorCliente);
				isCliente = true;
			} else {
				System.out.println("Contraseña incorrecta");
			}

		} else {
			System.out.println("El identificador no existe");
		}
		sc.nextLine();
	}


}
