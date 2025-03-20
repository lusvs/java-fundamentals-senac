/******************************************************************************

Exercício 2. Colocar estas duas linhas iniciais no método Main():
Random rnd = new Random(); //Inicia Aleatório
int x = rnd.nextInt(100); //Gera um número aleatório (0 – 99)

a. Faça um laço de repetição que solicite ao usuário digitar
um número e a quantidade de tentativas;
b. O laço encerra quando o usuário acertar o número ou atingir o número limite de tentativas;
c. Se o número do usuário for menor que o oculto,
escrever: “MAIOR”, se o número do usuário for maior que
o oculto, escrever: “MENOR”.

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class exr2
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	        Random rnd = new Random();
            int x = rnd.nextInt(100);
	    
	    for (int tentativa = 1; tentativa <= 10; tentativa++){
	        System.out.println("TENTATIVA NUMERO: " + tentativa);
	        System.out.println("Digite um numero: ");
	        int numero = entrada.nextInt();
	        if (numero == x) 
	            System.out.println("ACERTOU");
	        else{
	            System.out.println("ERROU");
	            if (numero > x)
	                System.out.println("O numero é MENOR");
	                else 
	                    System.out.println("O numero é MAIOR");
	        }
	    }
	}
}