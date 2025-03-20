
/******************************************************************************

Exercício 1. Informar todos os números de 1000 a 1999 que
quando divididos por 11 obtemos resto = 5.

*******************************************************************************/
import java.util.Scanner; 
public class exr1
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
		System.out.println("Exercício 1");
		
		
		for(int i = 1000; i <= 1999; i++){
        	 if(i%11 == 5)
        		System.out.println(i);
		}
	}
}