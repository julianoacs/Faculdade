/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

//@author Julianoacs

public class OperadoresLogicos {

    //Operador ternario.
    
    public static void main(String[] args) {
       int n1, n2, r;
       n1 = 4;
       n2 = 8;
       r = (n1>n2)?0:1;
       System.out.println(r);
       
       // > maior que 
       // < menor que 
       // >= maior ou igual 
       // <= menor ou igual
       // == igualdade
       // != diferenca
       
       //Comparacao String
       String nome1 = "Juliano";
       String nome2 = "Juliano";
       String nome3 = new String("Juliano");
       
       
       /*int x, y, z;
       x = 4;
       y = 7;
       z = 12;
       boolean r;
       r = (x<y && y==z)?true:false;
        System.out.println(r);*/
        
        //&& - as duas opcoes tem que ser true
        //|| - uma das opcoes pode ser true
        //^ - uma opcao exclusiva tem que ser true
        //! - operar nao, inverte de true para false
    }
    
}
