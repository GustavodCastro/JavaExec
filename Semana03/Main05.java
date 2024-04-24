import java.util.Scanner;
public class Main05{
  public static void main (String[]args) {
	//Entrada
	Scanner scan = new Scanner (System.in);
	  System.out.println ("Insira os 10 valores:");

	//Processamento
	double soma = 0;

	for (int i = 0; i < 10; i++)
	  {
		double valor = scan.nextDouble ();
		  soma += valor;
	  }

	double media = soma / 10;

	//Saída
	System.out.println ("Média aritmética dos valores é" + media);

	scan.close ();
  }
}
