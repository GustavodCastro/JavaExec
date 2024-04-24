import java.util.Scanner;

public class Main06
{
	public static void main(String[] args) {
	
	 //Entrada
	 Scanner scan = new Scanner(System.in);
		System.out.println("Insira o valor do Salário Fixo:");
		double salarioFixo = scan.nextDouble();
		  
		System.out.print("Digite o valor das vendas efetuadas: R$");
        double valorVendas = scan.nextDouble();
        
    //Processamento
        double comissaoA = 0.03;
        double comissaoB = 0.05;
        double maxcomissao = 1500.00;
        
        double comissao = 0.0;
        if (valorVendas <= maxcomissao) {
            comissao = valorVendas * comissaoA; 
        } else {
           comissao =  (maxcomissao * comissaoA) + ((valorVendas - maxcomissao) * comissaoB);
        }
        
    //Saída
        double salariototal = salarioFixo + comissao;
        System.out.println("O valor total das vendas é:" + salariototal);
        scan.close();
	}
}
