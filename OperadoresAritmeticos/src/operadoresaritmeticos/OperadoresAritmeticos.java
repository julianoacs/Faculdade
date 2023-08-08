/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

// @author Julianoacs

/* Precedência na matemática, da maior pra menor:
 *Parênteses;
 *Expoentes;
 *Multiplicações e divisões; (da esquerda para a direita);
 *Somas e subtrações. (da esquerda para a direita);*/

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 2;
        float sm = n1 + n2;//soma
        float sb = n1 - n2;//Subtracao
        float mt = n1 * n2;//Multiplicacao
        float dv = n1 / n2;//divisao
        float re = n1 % n2;//resto divisao
        System.out.println(sm);
        System.out.println(sb);
        System.out.println(mt);
        System.out.println(dv);
        System.out.println(re);
        
        
        //Operadores Unarios
        
        int numero = 5;
        int valor = 5 + numero++;//++ ou -- antes pre / ++ ou -- depois pos.
        System.out.println(valor);
        
        //Operadores de Atribuicao
        
        int a = 4;
        int b = 4;
        int c = 4;
        int d = 4;
        int e = 4; 
        a += 2;//a = a + 2
        b -= 2;//b = b - 2
        c *= 2;//c = x * 2
        d /= 2;//d = d / 2
        e %= 2;//e = e % 2
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
