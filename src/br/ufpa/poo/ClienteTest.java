package br.ufpa.poo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {

	private PizzaHut ph;

	@Test
	void testNovoCliente() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");
		Assertions.assertEquals(c1.getNome(), "Gustavo");
	}

	@Test
	void testRealizarPedido() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");
		ph = new PizzaHut();
		c1.realizarPedido("Pizza", ph, 22,45);
		Assertions.assertEquals(c1.getPedido().getNome(), "Pizza");
	}

	@Test
	void testValorPedido() {
		Cliente c1 = new Cliente("Gustavo", "00000000000");

		c1.realizarPedido("Pizza de Queijo", new PizzaHut(), 22,45);
		// COMO FAZ O TESTE DO VALOR DO PEDIDO???
	}

}
