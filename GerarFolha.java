package aula;

import javax.swing.JOptionPane;

public class GerarFolha {

	//set configura e o get lê os dados
	
	//variavel com static nao e criada em memoria
	//quando o metodo é static ele fica visivel pra todos e n precisa instanciar
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura: ")));
		pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso: ")));
		JOptionPane.showMessageDialog(null, pessoa.respostaimc());
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(JOptionPane.showInputDialog("Insira seu nome: "));
		funcionario.setCpf(JOptionPane.showInputDialog("Insira seu cpf: "));
		funcionario.setSalarioBruto(Double.parseDouble(JOptionPane.showInputDialog("Insira seu salário bruto: ")));
		
		JOptionPane.showMessageDialog(null, "Nome: "+funcionario.getNome() + " Sal. Liq. : "+funcionario.calcularFolha());
		JOptionPane.showMessageDialog(null, "Folha gerada com sucesso!");
		
	}

}
