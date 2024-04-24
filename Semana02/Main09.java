import java.util.Scanner;

public class Main09 {
  public static void main (String[]args) {

	Scanner scan = new Scanner (System.in);
	//Entrada
	  System.out.println ("Selecione o numero do mês:");
	  System.out.println("1 - Janeiro; 2 - Fevereiro; 3 - Março;");
	  System.out.println("4 - Abril; 5 - Maio; 6 - Junho;");
	  System.out.println("7 - Julho; 8 - Agosto; 9 - Setembro;");
	  System.out.println("10 - Outubro; 11 - Novembro; 12 - Dezembro;");
	int mes = scan.nextInt();
	
	//Processamento e Saída

	switch (mes)
	  {
	 case 1:
	 case 2:
	 case 12:
	    System.out.println ("Mes de Verão.");
	    break;

	case 3:
	case 4:
	case 5:
	    System.out.println ("Mês de Outuno.");
	    break;


	case 6:
	case 7:
    case 8:
	    System.out.println ("Mês de Inverno.");
		break;

	case 9:
	case 10:
	case 11:
	    System.out.println ("Mêss de Primavera.");
	    break;
	  }
	scan.close ();
  }
}
