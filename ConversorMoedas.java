package calculadora;

import java.util.Scanner;

public class ConversorMoedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //DECLARAÇÃO DE VARIAVEIS
		double valorReal, cotacaoMoeda, valorConvertido;
		
		//ENTRADA DE DADOS 
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor em reais: ");
		valorReal = ler.nextDouble();
		
		System.out.print("Digite a cotação da moeda desejada: ");
		cotacaoMoeda = ler.nextDouble();
		
		//PROCESSAMENTO
		valorConvertido = valorReal * cotacaoMoeda;
		
		//SAIDA
		System.out.print("O valor convertido para a moeda desejada é : " + valorConvertido);
		
		ler.close();
	}

}
