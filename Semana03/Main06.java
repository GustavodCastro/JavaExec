import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
	    //Entrada
	    Scanner scan = new Scanner(System.in);
		System.out.println("Insira o número de alunos da turma:");
		int t = scan.nextInt();
		
		double soma1 = 0;
		System.out.println("Insira as notas dos alunos:");
		//Processamento
		for (int i = 0 ; i < t; i++){
		    double nota = scan.nextDouble();
		    soma1 += nota;
		}
		double media = soma1 / t ;
	
	    //Saída
		System.out.println("Média das notas é: " + media);
		scan.close();
	}
}
