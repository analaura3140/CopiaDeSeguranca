package aula12;

import java.util.Random;
import java.util.Scanner;

public class Adivinhação {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random random = new Random();

		int num = random.nextInt(100) + 1;
		int palpite;
		int tentativas = 0;
		System.out.println("Jogo do Número Secreto: ");
		System.out.println("Tente adivinhar o número entre 1 e 100");

		while (true) {
			System.out.print("Digite o seu palpite: ");
			palpite = ler.nextInt();
			tentativas++;
			if (palpite > num) {
				System.out.println("Errado. O número é menor. ");
			} else if (palpite < num) {
				System.out.println("Errado. O número é maior. ");
			} else {
				System.out.println("Acertou! O número era: " + num);
				System.out.println("Você acertou em: " + tentativas + " tentativas");
				break;
			}

		}
		ler.close();
	}
}
