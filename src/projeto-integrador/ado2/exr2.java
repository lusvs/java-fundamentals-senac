/******************************************************************************

Dado um valor inteiro N imprimir os 3 primeiros múltiplos deste
valor;

*******************************************************************************/
import java.util.Scanner;

public class exr2 
{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int n = scanner.nextInt();
        
        int conta1 = n * 2;
        int conta2 = n * 3;
        int conta3 = n * 4;
        
         System.out.println("o primeiros multiplos de " + n + " são: " + conta1 + ", " + conta2 + ", " + conta3);
    }
}