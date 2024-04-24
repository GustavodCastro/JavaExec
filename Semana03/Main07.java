import java.util.Scanner;

public class Main07
{
	public static void main(String[] args) {
	    //Entrada
	    Scanner scan = new Scanner(System.in);
		System.out.println("Insira um número inteiro positivo:");
		
		int valor = scan.nextInt();
		int soma1 = 0;
		//Processamento
	        if (valor <= 0){
		           System.out.println("O valor fornecido não é positivo, insira outro");
	    	}else {
		        for (int i = 2; i < valor; i += 2) {
                soma1 += i;
		        }
                //Saída		        
		        System.out.println("A soma de números pares até " + valor +" é: "+soma1);
		    }
	scan.close();
	}
}
