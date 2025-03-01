import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lucas.svsantos1
 */
public class exer3 {
 
public static void main(String[] args) {
 
Scanner input = new Scanner(System.in);
 
System.out.println("Altura: ");
 
Float altura = input.nextFloat();
 
System.out.println("Peso: ");
 
Float peso = input.nextFloat();
 
Float indiceMassa = (peso / altura * altura);
 
if (indiceMassa < 18.5) {
 
System.out.println("Abaixo do peso");
 
}
 
else if (indiceMassa >= 18.5 && indiceMassa <= 24.9) {
 
System.out.println("Normal");
 
}
 
else if (indiceMassa >= 25 && indiceMassa <= 29.9) {
 
System.out.println("Sobrepeso");
 
}
 
else if (indiceMassa >= 30 && indiceMassa <= 39.9) {
 
System.out.println("Obeso");
 
}
 
else {
 
System.out.println("Obesidade mórbida");
 
}
 
}
}