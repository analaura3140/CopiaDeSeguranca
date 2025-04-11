package String;

import java.util.Scanner;

public class DesafioDev_Vida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // DECLARAÇÃO DE VARIAVEIS
		double nota1, nota2, nota3, nota4, media;
		
		// CHAMA O SACNNER
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
		
		//SAIDA
		if (media > 6) {
			System.out.println("Aprovado: " + media);
		}
			
		else if (media == 6) {
				System.out.println("Aprovado: " + media);
			}
			
		else {
			System.out.println("Reprovado: " + media);
		}
	}
}

		
