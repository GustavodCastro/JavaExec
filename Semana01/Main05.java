
import java.util.Scanner;
public class Main05
{
  public static void main (String[]args)
  {
	//Entrada
	Scanner scan = new Scanner (System.in);

	  System.out.println ("Digite o numero de horas trabalhadas no mês:");
	int horasTrabalho = scan.nextInt ();

	  System.out.println ("Digite o valor de salário por hora:");
	double salarioHora = scan.nextDouble ();

	//Processamento e Saida

	int horamensalmax = 160;

	double salarioBase = horasTrabalho * salarioHora;

	if (horasTrabalho > horamensalmax)
	  {

		int horasExtra = (horasTrabalho - horamensalmax);
		double salarioExtra = horasExtra * (salarioHora / 2);

		double salarioTotal = salarioBase + salarioExtra;

		  System.out.println ("O saláriorio Mensal é): " + salarioTotal);
	  }
	else
	  {
		System.out.println ("O salário Mensal é):" + salarioBase);
	  }
	scan.close ();
  }
}
