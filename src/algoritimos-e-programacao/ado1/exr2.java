/******************************************************************************

Dados dois números, verificar se a divisão do primeiro número pelo
segundo é exata (o resto da divisão deve ser igual a 0). Se for, o
algoritmo deve imprimir a mensagem “A divisão de (número 1) por
(número 2) é exata”.

*******************************************************************************/
import java.util.Scanner;

public class exr2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
    System.out.println("Primeiro numero: ");
    Float n1 = input.nextFloat();
    
    System.out.println("Segundo numero: ");
    Float n2 = input.nextFloat();
    
    Float divisao = n1 / n2;
 
    if (divisao%2 == 0) 
	   System.out.println("A divisão de " + n1 + " por " + n2 + " é exata");
	else 
	   System.out.println("ERROR, tente novamente");
    }
}