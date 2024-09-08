package aula;

public class Produto {
	private String descricao;
	private Double valor;
	private Integer quantidade;
	

	public Produto(String descricao, Double valor, Integer quantidade) {
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Double calcularicms() {
		return (valor*quantidade)*0.12;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	
	
}
