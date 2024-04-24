import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		 //Entrada
		 System.out.println("Insira o primeiro valor:");
		 int valor1 = scan.nextInt();
		 
		 System.out.println("Insira o segundo valor:");
		 int valor2 = scan.nextInt();
		 
		 //Processamento e Saida
		 
		 if (valor1 == valor2){
		     System.out.println("Números Iguais.");
		 } else if (valor1 > valor2){
		     System.out.println("Primeiro é maior.");
		 } else {
		     System.out.println("Segundo é maior.");
		 
		 }
		 scan.close();
		 
	}
}
