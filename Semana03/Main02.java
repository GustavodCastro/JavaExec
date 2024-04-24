import java.util.Scanner;

public class Main02
{
	public static void main(String[] args) {
		//Entrada
		Scanner scan = new Scanner (System.in);
		
		int n = -1;
		
		do {
		    System.out.println("Insira o valor de N:");
		    n = scan.nextInt();
		
		    if (n < 0){
    		    System.out.println("Insira um valor de N válido/positivo.");
    		    n = scan.nextInt();
    		}
		
	    } while (n < 0);
	    
	    for (int i = 0; i <= n; i++)
	    {
	        System.out.println(i);    
	    }
	    
		scan.close();
		
		
	}
}
