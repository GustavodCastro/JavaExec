import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    //Entrada
	    
	    System.out.println("Insira uma frase:");
        String frase = scan.nextLine();
        
        System.out.println("Digite a palavra que deseja encontrar na frase:");
        String palavra = scan.next();
        
        //Processamento e saida
            int indice = frase.indexOf(palavra);
            if (indice != -1){
                System.out.println("A palavra " + palavra + " está na posição " + indice + " na frase.");
            } else {
                System.out.println("A palavra \"" + palavra + "\" não foi encontrada na frase.");
        }
        
        scan.close();
	}
}
