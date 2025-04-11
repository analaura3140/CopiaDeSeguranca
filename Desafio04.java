package desafios;

import java.util.Scanner;
import java.util.Random;

public class Desafio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Escolha o canto para o chute:");
		System.out.println("1 - Esquerda");
		System.out.println("2 - Meio");
		System.out.println("3 - Direita");
		System.out.print("Digite sua escolha (1, 2 ou 3): ");
		int escolhaJogador = ler.nextInt();

		int escolhaGoleiro = random.nextInt(3) + 1;

		System.out.println("O goleiro escolheu: " + escolhaGoleiro);

		if (escolhaJogador != escolhaGoleiro) {
		System.out.println("Gol! Você marcou!");
		} else {
		System.out.println("O goleiro defendeu!");
		}

		ler.close();

		}

		}