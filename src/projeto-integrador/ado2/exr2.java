//2. Dado um valor inteiro N imprimir os 3 primeiros múltiplos deste
// valor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado2.pi;

import java.util.Scanner;

/**
 *
 * @author lucas.svsantos1
 */
public class exr2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Digite um numero: ");
        int n = scanner.nextInt();
        
        int conta1 = n * 2;
        int conta2 = n * 3;
        int conta3 = n * 4;
        
         System.out.println("o primeiros multiplos de " + n + "são: " + conta1 + ", " + conta2 + ", " + conta3);
    }
}