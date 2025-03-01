//1. Dados 3 valores reais (float ou double) imprimir o valor do
// produto destes valores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ado2.pi;

import java.util.Scanner;

/**
 *
 * @author lucas.svsantos1
 */
public class exr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();
        
        double produto = valor1 * valor2 * valor3;
        
        System.out.println("O valor do produto é: " + produto);
    }
    
}