/******************************************************************************

Dado um nome (String) não composto, imprimir a quantidade de
caracteres deste nome.

*******************************************************************************/
import java.util.Scanner;

public class exr4 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite uma palavra: ");
    String palavra = scanner.next();
    
    System.out.println("A sua palavra tem " + palavra.length());
    }  
}