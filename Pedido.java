package aula;

import java.time.LocalDate;

public class Pedido {

	private Integer numero;
	private LocalDate data; //Date no java
	private Double total;
	private static int contador;
	
	public Pedido(Integer numero, LocalDate data, Double total) {
		this.numero = numero;
		this.data = data;
		this.total = total;
		contador++; //nao precisa do set pq o contador ta no construtor
	}
	
	public static int getContador() {
		return contador;
	}

	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
}
