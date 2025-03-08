/******************************************************************************

Dados 3 valores reais (float ou double) imprimir o valor do
produto destes valores;

*******************************************************************************/
import java.util.Scanner;

public class exr1 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();
        
        double produto = valor1 * valor2 * valor3;
        
        System.out.println("O valor do produto é: " + produto);
    }
}