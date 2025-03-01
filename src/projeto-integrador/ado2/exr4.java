// 4. Dado um nome (String) não composto, imprimir a quantidade de
// caracteres deste nome.

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
public class exr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite uma palavra: ");
    String palavra = scanner.next();
    
    System.out.println("A sua palavra tem " + palavra.length());
    }  
}