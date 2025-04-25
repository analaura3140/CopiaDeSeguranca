package aula12;

import java.util.Scanner;

public class CorridaEspacial {

	public static void main(String[] args) {
	int estrelas;
	int fim = 10;
	int rodadas = 0;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Seja bem-vindo à corrida espacial, seu objetivo é desviar para o lado correto para continuar o jogo. ");
	do {
		 System.out.println("estrelas " + estrelas);

		 if (estrelas == 10) {
			 System.out.println("escolha um lado: ");
			 String escolha = ler.next();
			 if (!escolha.equals("direita")||escolha.equals("esquerda")) {
				 System.out.println("Escolha errada! Você falhou!");
				 break;
			 }
	}
		 rodadas++;
}while (rodadas < fim);
	 estrelas++;
	while (estrelas != 10);
	 ler.close();
	 }
	
	}

	

