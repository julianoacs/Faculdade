/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

//@author Julianoacs

/*Escreva um aplicativo que insira três inteiros digitados pelo usuário e
exiba a soma, média, produto e os números menores e maiores.*/

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int resultado = 0;
        int resultado2 = 0;
        int resultado3 = 0;
        
        
    System.out.println("Digite um numero ");
    numero1 = input.nextInt();
    System.out.println("Digite outro numero ");
    numero2 = input.nextInt();
    System.out.println("Digite outro numero ");
    numero3 = input.nextInt();
        
    resultado = numero1 + numero2 + numero3;
    resultado2 = resultado /3;
    resultado3 = numero1 * numero2 * numero3;
    
    System.out.println("A soma dos valores e " + resultado);
    System.out.println("O produto dos valores e " + resultado2);
    System.out.println("O multiplicacao dos valores e " + resultado3);

    }
}
