/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicaosimples;

import java.util.Scanner;

// @author Juliano Silva

public class CondicaoSimples {


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float n1, n2, media = 0;
        
        System.out.println("Digite a Primeira Nota: ");
        n1 = teclado.nextFloat();
        System.out.println("Digite a Segunda Nota: ");
        n2 = teclado.nextFloat();
        media = (n1 + n2)/2;
        System.out.println("Sua media e " + media);
        if (media >= 7){
            System.out.println("Parabens");
        }      
    }
    
}
