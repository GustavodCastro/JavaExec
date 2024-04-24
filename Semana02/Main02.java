import java.util.Scanner;

public class Main02
{
	public static void main (String[] args) {
		
		//Entrada
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite três valores:");
		
		int valor1 = entrada.nextInt();
		int valor2 = entrada.nextInt();
		int valor3 = entrada.nextInt();
		int maior;
		
		//Processamento
		
		if (valor1 > valor2 && valor1 > valor3){
		    maior = valor1;
		} else if (valor2 > valor1 && valor2 > valor3) {
		    maior = valor2;
		}else{
		    maior = valor3;
		}
		
		//Saida
		
		System.out.println("O maior numero é " + maior);
	    entrada.close();	
	}
}

