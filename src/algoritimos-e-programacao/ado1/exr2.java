/******************************************************************************

Dado um número, verificar se ele é maior que 100. Se for, o algoritmo
dDada a altura e o peso de uma pessoa, determinar seu grau de
obesidade. O grau de obesidade é determinado pelo índice da massa
corpórea (Massa = Peso / Altura2) através da tabela abaixo:

Massa Corpórea  Grau de Obesidade
    < 26              Normal
    > 26 e < 30       Obeso
    > 30              Obeso Mórbido

*******************************************************************************/
import java.util.Scanner;

public class exr2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
    System.out.println("Altura: ");
    Float altura = input.nextFloat();
 
    System.out.println("Peso: ");
    Float peso = input.nextFloat();
 
    Float indiceMassa = (peso / altura * altura);
    
    if (indiceMassa < 18.5)
    System.out.println("Abaixo do peso");
 
    else if (indiceMassa >= 18.5 && indiceMassa <= 24.9) 
    System.out.println("Normal");
 
    else if (indiceMassa >= 25 && indiceMassa <= 29.9) 
    System.out.println("Sobrepeso");
 
    else if (indiceMassa >= 30 && indiceMassa <= 39.9) 
    System.out.println("Obeso");
 
    else 
    System.out.println("Obesidade mórbida");
    }
}