import java.util.Scanner;

public class Main09
{
  public static void main (String[]args)
  {
	//Entrada;
	Scanner scan = new Scanner (System.in);

	  System.out.println ("Digite o valor principal:");
	float p = scan.nextFloat ();

	  System.out.println ("Digite a taxa de juros:");
	double r = scan.nextDouble () / 100;

	  System.out.println ("Digite o numero de anos:");
	int n = scan.nextInt ();

	//Processamento:

	double montanteFinal = p * Math.pow (1 + r, n);

	//Saida:

	  System.out.println ("O valor do montante é :" + montanteFinal);
	  scan.close ();

  }
}
