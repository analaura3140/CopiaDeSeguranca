package desafios;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		double ano;
	
		System.out.println("Escreva o ano de nascimento: ");
		ano = ler.nextDouble();
		
		if(ano >= 1946 && ano <= 1964) {
		System.out.println("Você pertence à geração Baby Boomers");
		}
		else if(ano >= 1965 && ano <= 1980) {
		System.out.println("Você pertence à geração X");
		}
		else if(ano >= 1981 && ano <= 1996) {
		System.out.println("Você pertence à geração Y");
		}
		else if(ano >= 1997 && ano <= 2010) {
		System.out.println("Você pertence à geração Z");
		}
		else if(ano >= 2011) {
		System.out.println("Você pertence à geração Alpha");
		}
		else {
		System.out.println("Ano de nascimento inválido para essas gerações");
		}
		ler.close();
	}

}
