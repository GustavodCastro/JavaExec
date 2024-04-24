import java.util.Scanner;

public class Main06
{
	public static void main(String[] args) {
		//Entrada
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a quantidade de maças:");
		int quantidade = scan.nextInt();
		
		//Processamento e Saída
		
		float precofinal;
		
		
		if (quantidade <= 12) {
		    
		    precofinal = quantidade * 1.30f;
		    System.out.println("O custo total da compra é: " + precofinal);
		}else {
		    
		    precofinal = quantidade *1.00f;
		    System.out.println("O custo total da compra é: " + precofinal);
		}
		scan.close();
	}
}
