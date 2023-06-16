/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

// @author juliano

import java.util.Scanner;


public class Exercicio1 {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        int resultado2 = 0;
        int resultado3 = 0;
        int resultado4 = 0;
        
        
    System.out.println("Digite um numero ");
    numero1 = input.nextInt();
    System.out.println("Digite outro numero ");
    numero2 = input.nextInt();
        
    resultado = numero1 + numero2;
    resultado2 = numero1 * numero2;
    resultado3 = numero1 - numero2;
    resultado4 = numero1 / numero2;
    
    System.out.println("A soma dos valores e " + resultado);
    System.out.println("O Produto dos valores e " + resultado2);
    System.out.println("A diferenca entre os valores e " + resultado3);
    System.out.println("O quociente entre os valores e " + resultado4);
    }
 }
   
