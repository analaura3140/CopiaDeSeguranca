package aula12;

import java.util.Scanner;

public class Heroi {

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);


System.out.println("Sejam bem-vindo super-herói! Você precisa salvar a cidade ");
System.out.println("Até que número você quer contar: ");
int numerofinal = ler.nextInt();
int contador = 1;
 
do {
	 System.out.println("Contando: " + contador);
	 if (contador % 10 == 0) {
		 System.out.println("ARMADILHA! Digite o código da armadilha para continuar: ");
		 String codigo = ler.next();
		 if (!codigo.equals("a1a3")) {
			 System.out.println("Código errado! Você falhou!");
			 break;
		 }
	 }
	 contador++;
 } while (contador <=numerofinal);
 
if (contador > numerofinal) {
	 System.out.println("Você salvou a cidade!");
 }
 ler.close();
	}

}
