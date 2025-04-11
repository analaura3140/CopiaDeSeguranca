package desafios;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		double pontuacao;
		String nome;
		
		System.out.println("Informe o nome do personagem: ");
		nome = ler.next();
		System.out.println("Informe a pontuação de força: ");
		pontuacao = ler.nextDouble();
		
		if(pontuacao >= 81 && pontuacao <=100) {
		System.out.println( nome + "O personagem é lendário ");
		}
		else if(pontuacao >= 51 && pontuacao <=80) {
		System.out.println( nome + "O personagem é da Elite ");
		}
		else if(pontuacao >= 21 && pontuacao <=50) {
		System.out.println( nome + "O personagem é guerreiro ");
		}
		else if(pontuacao >= 1 && pontuacao <=20) {
		System.out.println( nome + "O personagem é iniciante ");
		}
		else {
		System.out.println("Pontuação inválida");
		}
		ler.close();

	}
}