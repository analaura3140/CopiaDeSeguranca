package Desafios;

import java.util.Scanner;

public class ParEimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int par = 0;
int impar = 0;
int neutro = 0; 

Scanner ler = new Scanner(System.in);

     for (int i = 0; i < 10; i++) {
    	 System.out.println("Digite um número aleatório: ");
         int num = ler.nextInt();
     
         if (num == 0) {
    	    neutro++;
         } else if (num % 2 ==0) {
        	par++; 
         }else {
            impar++;
     }
}
System.out.println("Números pares: " + par + " " + "Números ímpares: " + impar);
           
         if (par > impar) {
        	 System.out.println("O número par ganhou ");
         } 
         else if (par == impar) {
        	 System.out.println("Empate");
         } 
         else {
        	 System.out.println("O número ímpar ganhou ");
         }
         System.out.println("O numero 0 foi digitado " + neutro + "x");
         
ler.close();
	}
}
     