/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

// @author Julianoacs

/*Escreva um aplicativo que leia cinco inteiros, além de determinar e
imprimir o maior e o menor inteiro no grupo.*/

import java.util.Scanner;

public class Exercicio4 {

   
    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 5 numeros:");

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("O maior numero e: " + maior);
        System.out.println("O menor numero e: " + menor);
    
        
        //programa aula java
    }
    
}
