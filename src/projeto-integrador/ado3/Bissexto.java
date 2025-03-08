/******************************************************************************

Dado um ano com 4 dígitos dizer se ele é um ano bissexto ou não. (Lembre-se que
um ano é bissexto se ele for divisível por 400 ou se ele for divisível por 4 e não
por 100.)

*******************************************************************************/
import java.util.Scanner;

public class Bissexto
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite o ano: ");
	    float ano = entrada.nextFloat();
	    
	    if (ano%2 == 0) {
	        System.out.println("bissexto");
	    }else {
	        System.out.println("ano normal");
	    }
	}
}
