package aula;

import java.util.Scanner;

public class MenuProduto {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Arroz", 25.0,2);
		String resposta;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Produto: "+produto1.getDescricao());
			System.out.println("Valor: "+produto1.getValor());
			System.out.println("Quantidade: "+produto1.getQuantidade());
			System.out.println("Descrição: "+produto1.getDescricao());
			System.out.println("Valor: "+produto1.getValor());
			System.out.println("Total: "+(produto1.getValor()*produto1.getQuantidade()));
			System.out.println("ICMS: "+produto1.calcularicms());
			System.out.println("Deseja sair? (S/N) ");
			resposta = ler.next();
			
			
		}while(!"S".equalsIgnoreCase(resposta));  //equals para comparar strings
		ler.close();
	}

}
