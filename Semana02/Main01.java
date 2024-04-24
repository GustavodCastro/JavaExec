import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    //Entrada
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor = entrada.nextInt();
		
		//Processamento e Saída
		
		if (valor < 0){
		    System.out.println("O valor é negativo.");
		} else if (valor == 0){
            System.out.println("O valor é igual a zero.");		    
		} else {
		    System.out.println("O valor é positivo");
		}
        entrada.close();
	}
}
