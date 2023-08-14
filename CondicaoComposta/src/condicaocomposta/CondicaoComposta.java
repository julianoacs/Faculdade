/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicaocomposta;

import java.util.Scanner;

/**
 *
 * @author Juliano Silva
 */
public class CondicaoComposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int nasc = 0;
        int ano = 0;
        int idade = 0;
        
        System.out.println("Digite o ano do seu Nascimento: ");
        nasc = teclado.nextInt();
        System.out.println("Digite o Ano Atual: ");
        ano = teclado.nextInt();
        idade = ano - nasc;
        System.out.println("Sua idade e " + idade);
        if (idade >= 18){
            System.out.println("Voce e maior de idade");
        } else {
            System.out.println("Voce e menor de idade");
        }
    }
}
