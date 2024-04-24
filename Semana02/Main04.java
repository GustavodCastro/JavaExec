import java.util.Scanner;

public class Main04
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Entrada
		System.out.println("Digite o primeiro valor:");
        int a = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        int b = scan.nextInt();

        System.out.println("Digite o terceiro valor:");
        int c = scan.nextInt();
        
		 int menor, meio, maior;
	    //Processamento
		
		if (a < b && a < c) {
            menor = a;
            if (b < c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        
		} else if (b < a && b < c) {
            menor = b;
            if (a < c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
		} else {
            menor = c;
            if (a < b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }
        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);
        scan.close();
		
	}
}
