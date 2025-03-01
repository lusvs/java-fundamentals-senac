
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lucas.svsantos1
 */
import java.util.Scanner;
 
public class aula { 
 
public static void main(String[] args){
 
Scanner input = new Scanner(System.in);
 
 
System.out.println("***Calcula Media***");
 
System.out.println("Nome");
 
String nome = input.next();
 
System.out.println("Nota 1:");
 
float n1 = input.nextFloat();
 
System.out.println("Nota 2:");
 
float n2 = input.nextFloat();
 
System.out.println("Nota 3:");
 
float n3 = input.nextFloat();
 
float media = ((n1*0.2f)+(n2*0.3f)+(n3*0.5f));
 
System.out.println(nome + ", sua media é: " + media);
 
System.out.printf("%s, /nsua média foi: %.1f \n", nome, media);
 
System.out.println("Quantidade de faltas: ");
 
float faltas = input.nextFloat();
 
 
//Tudo certo
 
if (media >= 6 && faltas <= 18){
 
System.out.println("Aprovado");
 
} 
 
//Muita falta
 
else if (media >= 6 && faltas >= 18){
 
System.out.println("Reprovado");
 
} 
 
//Tudo errado
 
else if (media <= 6 && faltas >= 18){
 
System.out.println("Reprovado");
 
} 
 
//Media Ruim
 
else {
 
System.out.println("Reprovado");
 
} 
 
}
}