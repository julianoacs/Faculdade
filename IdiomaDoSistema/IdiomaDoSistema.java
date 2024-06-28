/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomadosistema;

// @author Julianoacs
// Programa para mostrar idioma do sistema

import java.util.Locale;
 
public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do sistema e ");
        System.out.println (idioma.getDisplayLanguage());
    }   
}
