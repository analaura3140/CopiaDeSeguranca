package Atividade1;

import java.util.Scanner;

public class Mês {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		double mês;
		final double domingo;
		final double segunda;
		final double terca;
		final double quarta;
		final double quinta;
		final double sexta;
		final double sabado;

		System.out.println("escreva o numero que representa o dia da semana");
		dia = ler.nextDouble();
		if(dia == 1) {
		System.out.println("É domingo");
		}
		else if(dia == 2) {
		System.out.println("É segunda");
		}
		else if(dia == 3) {
		System.out.println("É terça");
		}
		else if(dia == 4) {
		System.out.println("É quarta");
		}
		else if(dia == 5) {
		System.out.println("É quinta");
		}
		else if(dia == 6) {
		System.out.println("É sexta");
		}
		else if(dia == 7) {
		System.out.println("É sábado");
		}
		else {
		System.out.println("Numero Invalido");
		}
		}
		
       
	}


	}

}
