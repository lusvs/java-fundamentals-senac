/******************************************************************************

Utilizando a instrução switch escreva um programa que recebe um valor inteiro de
1 a 7 e retorna o correspondente dia da semana. Considere que 1 corresponde a
domingo, 2 a segunda-feira, ..., 7 a sábado. Além disso, no caso de uma entrada
errada, como por exemplo 0, deve ser impresso “Valor inválido!”;

*******************************************************************************/
import java.util.Scanner;

public class diaSemana
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite um numero de 1 a 7");
	    int semana = entrada.nextInt();
	    
	    switch(semana){
	        case 1:
	            System.out.println("Domingo");
	            break;
	        case 2:
	            System.out.println("Segunda");
	            break;
	        case 3:
	            System.out.println("Terça");
	            break;
	        case 4:
	            System.out.println("Quarta");
	            break;
	        case 5:
	            System.out.println("Quinta");
	            break;
	        case 6:
	            System.out.println("Sexta");
	            break;
	        case 7:
	            System.out.println("Sabado");
	            break;
	        default:
	            System.out.println("ERROR");
	    }
	}
}