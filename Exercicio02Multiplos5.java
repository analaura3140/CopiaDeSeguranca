package desafios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a;
Scanner ler = new Scanner(System.in);

   System.out.println("Informe um valor: ");
   a = ler.nextDouble();
   
         System.out.println(( a % 5 == 0) ? ("O número " + a + " é multiplo de 5") : ("O número " + a + " não é multiplo de 5"));
	}

}
