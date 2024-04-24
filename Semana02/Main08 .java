import java.util.Scanner;
public class Main08
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Entrada:
		System.out.println("Insira o número do mês:");
		int mes = scan.nextInt(); 
		
		
		//Processamento e Saida:
		if ((mes == 1)||(mes == 3) || (mes == 5) ||(mes == 7) ||(mes == 8) ||(mes ==  10) ||(mes == 12)){
		    System.out.println("Mes com 31 dias.");
		} else if ((mes == 4) || (mes == 6) ||(mes == 9) || (mes == 11)){
		    System.out.println("Mês com 30 dias.");
		} else if (mes == 2){
		    System.out.println("Mês com 28 dias.");
		} else {
		    System.out.println("Mês inválido.");
		}
		scan.close();
	}
}
