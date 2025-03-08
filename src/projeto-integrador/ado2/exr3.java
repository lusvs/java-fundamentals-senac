/******************************************************************************

Dado um valor inteiro de 1 até 10, imprimir a “tabela” da
tabuada deste valor;

*******************************************************************************/
import java.util.Scanner;

public class exr3 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite um numero de 1 a 10: ");
    int numero = scanner.nextInt();
    
    int tabela1 = numero * 1;
    int tabela2 = numero * 2;
    int tabela3 = numero * 3;
    int tabela4 = numero * 4;
    int tabela5 = numero * 5;
    int tabela6 = numero * 6;
    int tabela7 = numero * 7;
    int tabela8 = numero * 8;
    int tabela9 = numero * 9;
    int tabela10 = numero * 10;
    
    if (numero > 10){
        System.out.println("Erro");
        System.out.println("Tente novamente");
    } else {
        System.out.println("A tabuada de " + numero + " é: ");
        System.out.println(tabela1);
        System.out.println(tabela2);
        System.out.println(tabela3);
        System.out.println(tabela4);
        System.out.println(tabela5);
        System.out.println(tabela6);
        System.out.println(tabela7);
        System.out.println(tabela8);
        System.out.println(tabela9);
        System.out.println(tabela10);
     }
    }
}

