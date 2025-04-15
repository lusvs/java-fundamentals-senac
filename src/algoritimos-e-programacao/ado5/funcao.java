import java.util.*;
public class Main
{
    public static int entradaDados() {
		System.out.println("*-- ENTRADA DE DADOS --*");
		Scanner imput = new Scanner(System.in); 
		System.out.println("NUMERO: "); 
		int n = imput.nextInt();
		return n;
	}
	
	public static void imprimir(int n) {
	    System.out.println("*-- IMPRIMIR --*");
	    System.out.println("Menor: " + n);
	}
	
	public static int menor(int n1, int n2) {
		System.out.println("*-- MENOR --*"); 
		int numMenor; // Vai receber um numero
		if (n1 <= n2) {//  Se o n1 for menor que o n2, a variavel "numMenor" vai receber n1
		    numMenor = n1; 
	} else { //  Se o n2 for menor que o n1, a variavel "numMenor" vai receber n2
	    numMenor = n2;
	}
	return numMenor;
    }

    public static void main(String[] args) {
        int n1 = entradaDados(); //Chama a função entradaDados e determina 
        int n2 = entradaDados(); //Chama a função entradaDados e determina 
		int result = menor(n1, n2);
		imprimir(result);
	}
}