package desafios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3, nota4, media;
		//CHAMAR SCANNER
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a nota 1: ");
		nota1 = ler.nextDouble();
		System.out.println("Informe a nota 2: ");
		nota2 = ler.nextDouble();
		System.out.println("Informe a nota 3: ");
		nota3 = ler.nextDouble();
		System.out.println("Informe a nota 4: ");
		nota4 = ler.nextDouble();
		ler.close();
		//PROCESSAMENTO
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		String mensagem = media >= 6 ? "Aprovado" : "Reprovado";
		 System.out.println(mensagem);
		
	}

}
