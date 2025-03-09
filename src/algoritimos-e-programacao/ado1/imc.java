/******************************************************************************

O programa deve verificar as condições de pessoas com
idade entre 20 e 60 anos e acima de 60 anos - conforme tabela

*******************************************************************************/
import java.util.Scanner;

public class imc
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
		    System.out.println("Digite sua idade: ");
		    double idade = entrada.nextDouble();
		    
		    System.out.println("Digite seu peso: ");
		    double peso = entrada.nextDouble();
		    
		    System.out.println("Digite sua altura: ");
		    double altura = entrada.nextDouble();
		    
		    double contaUm = altura * 2;
		    double contaDois = peso / contaUm;
		    
		    if ((idade >= 20) && (idade <= 60)) {
		        if (contaDois < 18.5)
		           System.out.println("Baixo peso");
		        else if (contaDois < 24.99)
		           System.out.println("Normal"); 
		        else if (contaDois < 29.99)
		           System.out.println("Sobrepeso"); 
		        else 
		           System.out.println("Obeso"); 
		    } else if (idade > 60) {
		        if (contaDois < 22)
		           System.out.println("Baixo peso");
		        else if (contaDois < 27)
		           System.out.println("Normal"); 
		        else if (contaDois < 29.99)
		           System.out.println("Sobrepeso"); 
		        else 
		           System.out.println("Obeso"); 
		    } else {
		        System.out.println("ERROR, Tente Novamente");
		    }
	}
}
