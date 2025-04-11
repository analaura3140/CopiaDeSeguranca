package desafios;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		double mes;

		System.out.println("Escreva o número que representa o mês");
		mes = ler.nextDouble();
		if(mes == 1) {
		System.out.println("É janeiro");
		}
		else if(mes == 2) {
		System.out.println("É fevereiro");
		}
		else if(mes == 3) {
		System.out.println("É março");
		}
		else if(mes == 4) {
		System.out.println("É abril");
		}
		else if(mes == 5) {
		System.out.println("É maio");
		}
		else if(mes == 6) {
		System.out.println("É junho");
		}
		else if(mes == 7) {
		System.out.println("É julho");
		}
		else if(mes == 8) {
		System.out.println("É agosto");
		}
		else if(mes == 9) {
			System.out.println("É setembro");
		}
		else if(mes == 10) {
			System.out.println("É outubro");
		}
		else if(mes == 11) {
			System.out.println("É novembro");
		}
		else if(mes == 12) {
			System.out.println("É dezembro");
		}
		else {
		System.out.println("Mês Inválido");
		}
		ler.close();
		}
		
      
	}