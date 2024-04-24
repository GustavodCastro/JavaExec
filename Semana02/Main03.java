import java.util.Scanner;

public class Main03
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Entrada
		
		System.out.println("Digite o primeiro valor:");
        int valor1 = scan.nextInt();
        
        System.out.println("Digite o segundo valor:");
        int valor2 = scan.nextInt();
        
        System.out.println("Digite o terceiro valor:");
        int valor3 = scan.nextInt();
		
		//Processamento e Saída
		
		int soma;
		
		if (valor1 < valor2 && valor1 < valor3){
		    soma = valor2 + valor3;
		}else if (valor2 < valor1 && valor2 < valor3){
		    soma = valor1 + valor3;
		}else{
		    soma = valor1 + valor2;
		}
		
		System.out.println("A soma dos dois valores maiores é:" + soma);
		scan.close();
	}
}
