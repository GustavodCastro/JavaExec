import java.util.Scanner;

public class Main04
{
	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Insira o CPF: ");
	   
	   String arrayCpf = scan.nextLine();
	   String numerosCpf = arrayCpf.replaceAll("[^0-9]", "");
	   
	   System.out.println("Números do CPF: " + numerosCpf);
	}
}
