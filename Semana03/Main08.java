import java.util.Scanner;

public class Main08
{
	public static void main(String[] args) {
	   //Entrada
	    Scanner scan = new Scanner(System.in);
	    double soma = 0;
		System.out.println("Insira os 10 valores:");
		
		//Processamento
		for (int i = 0; i < 10; i++){
		    double valor = scan.nextDouble();
		    soma += valor;
		}
		//Saida
		System.out.println("A soma total dos valores inseridos é: " +soma);
		scan.close();
	}
}
