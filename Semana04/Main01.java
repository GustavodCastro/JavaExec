import java.util.Scanner;

public class Main01
{
	public static void main(String[] args) {
	    //Entrada
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Insira a frase:");
	  
	   //Processamento
	   String arrayLeitura = scan.nextLine();
	   int arrayCaractere = arrayLeitura.length();
	   String [] numeropalavras = arrayLeitura.split("\\s");
	   
	   //Saida 
	   System.out.println("Numero de caracteres: " + arrayCaractere);
	   System.out.println("Número de palavras: " + numeropalavras.length);
	    
    scan.close();
	}
}
