package desafios;

import java.util.Scanner;

public class Desafio01SwithCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner ler = new Scanner (System.in);
      int mes;
      
      System.out.println("Escreva o número que representa o mês: ");
      mes = ler.nextInt();
      
      switch (mes) {
      case 1:
    	  System.out.println("O mês escolhido é janeiro");
    	  break;
      case 2:
    	  System.out.println("O mês escolhido é feveireiro");
    	  break;
      case 3:
    	  System.out.println("O mês escolhido é março");
    	  break;
      case 4:
    	  System.out.println("O mês escolhido é abril");
    	  break;
      case 5:
    	  System.out.println("O mês escolhido é maio");
    	  break;
      case 6:
    	  System.out.println("O mês escolhido é junho");
    	  break;
      case 7:
    	  System.out.println("O mês escolhido é julho");
    	  break;
      case 8:
    	  System.out.println("O mês escolhido é agosto");
    	  break;
      case 9:
    	  System.out.println("O mês escolhido é setembro");
    	  break;
      case 10:
    	  System.out.println("O mês escolhido é outubro");
    	  break;
      case 11:
    	  System.out.println("O mês escolhido é novembro");
    	  break;
      case 12:
    	  System.out.println("O mês escolhido é dezembro");
    	  break;
    	  default:
    		  System.out.println("Informe um mês válido");
      }
ler.close();
	}

}
