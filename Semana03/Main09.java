import java.util.Scanner;

public class Main09
{
	public static void main(String[] args) {
	    //Entrada
	    Scanner scan = new Scanner(System.in);
	    double menor = 0;
		
		System.out.println("Insira 10 valores:");
		//Processamento
		
		for(int i = 0; i < 10; i++){
		    double valor = scan.nextDouble();
		    if (valor < 40){
		        menor += valor;
		    }
		}
		//Saída
		System.out.println("A soma dos valores inferiores a 40 é: " +menor);
		scan.close();
	}
}
