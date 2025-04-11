package calculadora;

import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARAÇÃO DE VARIAVEIS 
		double fahrenheit;
		final double CELSIUS;
		
		//ENTRADA DE DADOS
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		fahrenheit = ler.nextDouble();
		
		//PROCESSAMENTO
		CELSIUS = (((fahrenheit -32)*5)/9);
		
		//SAIDA
		System.out.print("A temperatura em Celsius é: " + CELSIUS);
		
		ler.close();
	}

}
