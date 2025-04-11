package Desafios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // DECLARAÇÃO DE VARIAVEIS 
		double Ângulo;
		double Radiano;
		
		//ENTRADA DE DADOS
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor em ângulo: ");
		Ângulo = ler.nextDouble();
		
		//PROCESSAMENTO
		Radiano = ((Ângulo*3.14)/180);
		
		//SAÍDA
		System.out.print("O valor em radiano é: " + Radiano);
		
		ler.close();
	}

}
