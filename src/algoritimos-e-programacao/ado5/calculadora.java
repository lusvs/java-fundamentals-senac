/******************************************************************************

Crie uma calculadora usando funções

*******************************************************************************/
import java.util.*;
public class CalculadoraSimples
{
	public static int menu() {
	    Scanner input = new Scanner(System.in);
	    int op;
	    do{
		System.out.println("*---MENU---*");
		System.out.println("1 - ADIÇÃO");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - MULTIPLICAÇÃO");
		System.out.println("4 - DIVISÃO");
		System.out.println("OPÇÃO:");
		op = input.nextInt();
		if(op < 1 || op > 4){
		    System.out.println("opção INVALIDA, digite novamente");
		}
	    } while  (op < 1 || op > 4);
	    
	    return op;
	}
	
	public static int entradaDados() {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Entrada de Dados");
	    System.out.println("-----------------");
	    System.out.println("NUMERO: ");
	    int num = input.nextInt();
	    return num;
	}
	
	public static float adicao(float n1, float n2){
	    System.out.println("*---ADIÇÂO---*");
	    return n1 + n2;
	} 
	
	public static float subracao(float n1, float n2){
	    System.out.println("*---SUBTRAÇÃO---*");
	    return n1 - n2;
	}
	
	public static float multiplicacao(float n1, float n2){
	    System.out.println("*---MULTIPLICAÇÃO---*");
	    return n1 * n2;
	}
	
	public static float divisao(float n1, float n2){
	    System.out.println("*---DIVISÃO---*");
	    return n1 / n2;
	}
	
	public static void imprimir(float result){
	    System.out.println("*---IMPRIMIR---*");
	    System.out.println("Resultado: " + result);
	}
	
	public static float controlador(float n1, float n2, int op){
	    System.out.println("*---CONTROLADOR---*");
	    float resultado = 0;
	    switch(op){
	        case 1:
	            resultado = adicao(n1, n2);
	            break;
	        case 2:
	            resultado = subracao(n1, n2);
	            break;
	       case 3:
	            resultado = multiplicacao(n1, n2);
	            break;
	       case 4:
	            resultado = divisao(n1, n2);
	            break;
	    }
	    return resultado;
	}
	public static void main(String[] args){
	    System.out.println("MAIN");
	    System.out.println("=============");
	    int op = menu();
	    float n1 = entradaDados();
	    float n2 = entradaDados();
	    float result = controlador(n1, n2, op);
	    imprimir(result);
	}
}
