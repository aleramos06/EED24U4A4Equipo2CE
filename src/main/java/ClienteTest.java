package main.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ClienteTest {

	// Creamos algunos clientes para usar en las pruebas
	Cliente cliente1 = new Cliente(123456, 123456);
	Cliente cliente2 = new Cliente(98620, 1234);

//	@Test
//	public void testGetSaldoValido() {
//		// Verificamos que el saldo inicial sea el correcto
//		assertEquals(5000.0, cliente1.getSaldo(), 0.0);
//	}

//	@Test
//	public void testGetSaldoNoValido() {
//		// Verificamos que el saldo inicial sea el correcto
//		assertEquals(6500.0, cliente2.getSaldo(), 0.0);
//	}
//
	@Test
	public void testIngresarSaldoValido() {
		// Ingresamos 1000 al saldo del cliente1
		cliente1.ingresarSaldo(1000);
		assertEquals(6000.0, cliente1.getSaldo(), 0.0);
	}
//
//	public void testIngresarSaldoNoValido() {
//		// Ingresamos 1000 al saldo del cliente1
//		cliente1.ingresarSaldo(1000);
//		assertEquals(7000.0, cliente1.getSaldo(), 0.0);
//	}
//
//    @Test
//    public void testComprobarIdentificador() {
//        // Verificamos que el identificador exista en los clientes
//        assertTrue(Cliente.comprobarIdentificador(new Cliente[] {cliente1, cliente2}, 123456));
//        // Verificamos que el identificador no exista
//        assertFalse(Cliente.comprobarIdentificador(new Cliente[] {cliente1, cliente2}, 111111));
//    }
//
//    @Test
//    public void testComprobarPassword() {
//        // Verificamos que la contraseña sea correcta
//        assertTrue(Cliente.comprobarPassword(new Cliente[] {cliente1, cliente2}, 123456));
//        // Verificamos que la contraseña no sea correcta
//        assertFalse(Cliente.comprobarPassword(new Cliente[] {cliente1, cliente2}, 111111));
//    }
//
//    @Test
//    public void testTransferirImporte() {
//        // Transferimos 1000 de cliente1 a cliente2
//        cliente1.transferirImporte(cliente1, cliente2);
//        // Verificamos que el saldo de cliente1 se redujo y el saldo de cliente2 aumentó
//        assertEquals(4000.0, cliente1.getSaldo(), 0.0);
//        assertEquals(6000.0, cliente2.getSaldo(), 0.0);
//    }
//}
}