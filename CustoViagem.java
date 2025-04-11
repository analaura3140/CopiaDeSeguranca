package calculadora;

import java.util.Scanner;

public class CustoViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //DECLARAÇÃO DE VARIAVEIS
		double valLitro, distanciaKM, consumo, totalLitros, totalgastos;
		
		//ENTRADA DE DADOS
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor do Litro de combustivel (RS): ");
		valLitro = ler.nextDouble();
		
		System.out.print("Informe a distancia percorrida (Km): ");
		distanciaKM = ler.nextDouble();
		
		System.out.print("Informe o consumo médio (Km/L):  ");
		consumo = ler.nextDouble();
		
		//PROCESSAMENTO
		totalLitros = distanciaKM/consumo;
		
		totalgastos = totalLitros*valLitro;
		
		//SAIDA
		
		System.out.println("O total de litros consumidos é: " + totalLitros + "litros");
		System.out.println("O total de gastos foi: " + totalgastos);
		
		ler.close();
	}

}
