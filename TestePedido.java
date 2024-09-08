package aula;

import java.time.LocalDate;

public class TestePedido {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido(123, LocalDate.now(), 100.);
		Pedido pedido2 = new Pedido(111, LocalDate.of(2024,8,29), 500.);
		Pedido pedido3 = new Pedido(154, LocalDate.now(), 260.);
		
		System.out.println(pedido.getNumero());
		System.out.println(pedido.getTotal());
		System.out.println(pedido2.getNumero());
		System.out.println(pedido2.getTotal());
		System.out.println(pedido3.getNumero());
		System.out.println(pedido3.getTotal());
		
		System.out.println(Pedido.getContador());
	}
	
}
