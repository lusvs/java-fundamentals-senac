/******************************************************************************

solicite 10 numeros ao usuario, atraves de um laço while,
e ao final mostre qual destes numeros é maior

*******************************************************************************/
import java.util.Scanner;


public class exr2
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
            int maior;
            
            System.out.println("Digite um numero: ");
            maior = entrada.nextInt();
            
            int num = 2;
            
            do{
                System.out.println("Digite um numero: ");
                maior = Math.max(maior, entrada.nextInt());
                num++;
            }while(num <= 10);
            
            System.out.println("O maior numero é:  " + maior);
	}
}