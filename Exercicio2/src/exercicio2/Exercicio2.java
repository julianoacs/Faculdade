/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

//@author juliano

/*Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números
e exiba o número maior seguido pelas palavras “É maior". Se os números forem iguais,
imprima a mensagem “Estes números são iguais".*/

import java.util.Scanner;

public class Exercicio2 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero1 = 0;
        int numero2 = 0;
    
    System.out.println("Digite o primeiro numero ");
    numero1 = input.nextInt();
    System.out.println("Digite o segundo numero ");
    numero2 = input.nextInt();
    
    if (numero1 > numero2 ){
        System.out.println(numero1 + " E maior ");
    } else if (numero2 > numero1){
        System.out.println(numero2 + " E maior ");  
    } else {
        System.out.println("Os numeros sao iguais");
    }
  input.close();
  }
}
  
