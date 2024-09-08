package aula;

import javax.swing.JOptionPane;

public class Funcionario {
	private String cpf;
	private String nome;
	private Double salarioBruto;
	private static int total = 0;
	
	
	public void setCpf(String cpf){
		this.cpf = cpf;		
	}
	
	public void setNome(String nome){
		this.nome = nome;		
	}
	
	public void setSalarioBruto(Double salarioBruto){
		if (salarioBruto > 1402.) {
			this.salarioBruto = salarioBruto; //this é quando é o mesmo nome pra diferenciar	
			JOptionPane.showMessageDialog(null,"Salário Líquido: "+ calcularFolha());
		}
		else {
			JOptionPane.showMessageDialog(null, "Salário inválido!");
		}
	}
	
	
	//Salario Liquido ** 0.11 de INSS e 0.6 de vale transporte
	 
	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public Double calcularFolha() {
		return salarioBruto * 0.83;
	}
	
	public static int registro() {
		return total++;
	}
	
}
