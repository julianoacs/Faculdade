/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao1;

import java.util.Scanner;

/**
 *
 * @author Juliano Silva
 */

public class Repeticao1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("Quantas cambalhotas voce quer ?");
        int cblt = teclado.nextInt();
        int cc = 1;
        while (cc <= cblt) {
            System.out.println("Cambalhota " + cc);
            cc = cc + 1;
        }
        System.out.println("Acabou");
    }
    
}
