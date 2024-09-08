package aula;

public class Pessoa {
	private Integer codigo;
	private String nome;
	private Double peso;
	private Double altura;
	
	//se calculo < 18.5 = abaixo do peso
	//senao se entre 18.5 e 24.9 = peso ideal
	//senao acima do peso 
	
	private double calculoimc() {
		return (peso/(altura*altura));
	}
	
	public String respostaimc() {
		if(calculoimc() < 18.5) {
			return "Abaixo do peso!";
		}
		else if(calculoimc() <= 24.9){		
			return "Peso ideal!";
		}
		else {
			return "Acima do peso!";   
		}
	}
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		if(peso <=0) {
			System.out.println("Peso inválido!");
		}
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		if(altura <=0) {
			System.out.println("Altura inválida!");
		}	
		this.altura = altura;
	}
	
	//como fazer pra repetir o input enquanto a altura ta
	//errada
	
}
