/******************************************************************************

 Dado um número, verificar se ele é maior que 100. Se for, o algoritmo
deve somar 150 a esse número. No final, imprimir o resultado da soma.

*******************************************************************************/
import java.util.Scanner;

public class exr1
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
 
        System.out.println("***DIGITE O NUMERO***");
        
        System.out.println("Numero: ");
        float numero = input.nextFloat();
        
        float soma = (numero + 150);
 
        if (numero >= 100)
            System.out.printf("Seu numero é" + soma);
        else 
            System.out.println("Tudo certo");
    }
}