/******************************************************************************

 Implemente uma calculadora que receba dois números e um operador (+, -, *, /)
 como entrada, e realize a operação correspondente.
 Utilize estruturas condicionais para tratar cada operador.

*******************************************************************************/
import java.util.Scanner;

public class calculadora
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, op;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite outro numero: ");
	    n2 = entrada.nextInt();
	    
	    System.out.println("Escolha uma opção\n1-adição\n2-subtração\n3-multiplicação\n4-divisão\n5-sair");
	    op = entrada.nextInt();
	    
	    if (op>=6) {System.out.println("Sair");}
	    
	    switch(op){
	        case 1: System.out.println("adição: " + (n1 + n2));break;
	        case 2: System.out.println("subtração: " + (n1 - n2));break;
	        case 3: System.out.println("multiplicação: " + (n1 * n1));break;
	        case 4: System.out.println("divisão: " + (n1 / n2));break;
	        case 5: System.out.println("sair");break;
	    }
	}
}
