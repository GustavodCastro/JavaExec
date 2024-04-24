import java.util.Scanner;

public class Main07
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Entrada
	    System.out.println("Insira a nota da Avaliacao 1:");
	    float nota1 = scan.nextFloat();
	    
	    System.out.println("Insira a nota da Avaliacao 2 :");
	    float nota2 = scan.nextFloat();
		
		//Processamento e Saída
		
		
		float mediaFinal = ((nota1 + nota2)/ 2);
		
		if (mediaFinal >= 6 ){
		    
		    System.out.println("Aprovado com média: " + mediaFinal);
		} else {
		    
		    System.out.println("Reprovado com média: " + mediaFinal);
		}
		scan.close();
	}
}
