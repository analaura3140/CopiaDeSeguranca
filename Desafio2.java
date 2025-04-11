package Desafios;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // DECLARAÇÃO DE VARIAVEIS
		double Ângulo, VelocidadeInicial;
		final double DistânciaPercorrida;
		
		//ENTRADA DE DADOS
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o ângulo: ");
		Ângulo = ler.nextDouble();
		
		System.out.print("Digite a velocidade inicial(m/s): ");
		VelocidadeInicial = ler.nextDouble();
		
		Ângulo = Math.toRadians(Ângulo);
		
		//PROCESSAMENTO
		DistânciaPercorrida = (Math.pow(VelocidadeInicial,2) * Math.sin(2*Ângulo))/9.8;
		
		//SAÍDA
		System.out.print("A distância percorrida em metro é: " + DistânciaPercorrida);
		
		ler.close();
	}

}
