
import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Insira o valor de n:");
	
	int n = scan.nextInt() ;
	int i = 1;
		for ( ; i <= n; i++) {
			System.out.println(i);
		}
		scan.close();
	}
}
