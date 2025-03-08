/******************************************************************************

Dados 3 valores (possíveis lados) verificar se eles formam um triângulo, e em caso
positivo, dizer se é equilátero, isósceles ou escaleno.

*******************************************************************************/
import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite o Primeiro Valor: ");
	    double n1 = entrada.nextDouble();
	    
	    System.out.println("Digite o Segundo Valor: ");
	    double n2 = entrada.nextDouble();
	    
	    System.out.println("Digite o Terceiro Valor: ");
	    double n3 = entrada.nextDouble();
	    
	    if ((n1 + n2 >= n3) && (n1 + n3 >= n2) && (n2 + n3 >= n1)) {
	        if ((n1 == n2) && (n2 == n3)) 
	            System.out.println("equilátero");
	        else if ((n1 == n2) || (n1 == n3) || (n2 == n3)) 
                System.out.println("Isósceles");
            else
	            System.out.println("escaleno");
	    } else
	         System.out.println("Os valores não formam um triângulo.");
	}
}
