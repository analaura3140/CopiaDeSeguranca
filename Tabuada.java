package Desafios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, r;
		
Scanner ler = new Scanner(System.in);

System.out.println("Informe um número: ");
n = ler.nextInt();

for (int i = 1; i <= 10; i++) {
r = n*i;
System.out.println("Tabuada: " + r);
ler.close();
}
	}
}
