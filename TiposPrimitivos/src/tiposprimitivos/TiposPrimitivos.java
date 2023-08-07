/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

//@author Julianoacs

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
      //String nome = "Juliano";
      //float nota = 9.9f;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno");
        String nome = teclado.nextLine();
        System.out.println("Digite a Nota do Aluno");
        float nota = teclado.nextFloat();
        System.out.println("A Nota e " + nota);
        System.out.printf("A nota de %s e %.2f \n", nome, nota);
        System.out.format("A nota de %s e %.2f \n", nome, nota);
    }
}
