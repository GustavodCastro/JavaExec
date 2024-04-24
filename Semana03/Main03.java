//Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS. 


import java.util.Scanner;
public class Main03
{
	public static void main(String[] args) {
		//Entrada 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira os números:");
		int contadorNegativos = 0; //aqui armazena a quantidade de vezes os valores negativos foram lidos.
	    //Processamento e saída
	    
		for (int i = 0; i <= 10; i++){
    		int n = scan.nextInt(); // Aqui recebe os valores inseridos, até 10 interações/valores.
		    if (n < 0){
               contadorNegativos++;//Aqui conta quantos valores negativos foram lidos.
		    }
		}
		
		System.out.println("Valores negativos: " +contadorNegativos);
		
	scan.close();

	}
}
