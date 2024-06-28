/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturascondicionais;

import java.util.Scanner;

/**
 *
 * @author Juliano Silva
 */
public class EstruturasCondicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Digite seu ano de nacimento: ");
        int nasci = keyboard.nextInt();
        int idade = 2023 - nasci;
        System.out.println(idade);
        if (idade < 16){
            System.out.println("Nao Vota.");
        } else {
           if ((idade >= 16 &&  idade < 18) || (idade > 70)){
               System.out.println("Voto Opcional.");
           } else {
               System.out.println("Voto Obrigatorio.");
           } 
        }
    }
    
}
