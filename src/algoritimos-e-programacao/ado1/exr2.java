
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lucas.svsantos1
 */
public class maior100 {
 
public static void main(String[] args){
 
Scanner input = new Scanner(System.in);
 
 
System.out.println("***DIGITE O NUMERO***");
 
System.out.println("Numero: ");
 
float numero = input.nextFloat();
 
float soma = (numero + 150);
 
 
if (numero >= 100){ 
 
System.out.printf("Seu numero é" + soma);
 
} 
 
else {
 
System.out.println("Tudo certo");
 
} 
 
}
}