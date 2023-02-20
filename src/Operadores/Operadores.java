package Operadores;

import org.w3c.dom.ls.LSOutput;

public class Operadores {
    public static void main(String[] args) {
    /*
    = atribuição
    == igual
    != diferente
    < menor
    > maior
    <= menor igual
    >= maior igual


    EX:
    */
        String nomeUm = "Marlon";
        String nomeDois = new String("Marlon");
        //equals é usado para comparar objetos
        System.out.println(nomeUm.equals(nomeDois));

        int idade = 14;
           if (idade >= 18){
               System.out.println("Pode dirigir");
           }else{
               System.out.println("Não pode dirigir");
           }


       boolean sorveteDerrete = true;
           if(sorveteDerrete){
               System.out.println("é verdade sorvete derrete!!!");
           }else{
               System.out.println("parabéns você está no polo norte do sul da california!!!");
           }


        /*
        Operadores aritméticos
        + adição ou em uso com String realizará a concatenação
        - subtração
        * multiplicação
        / divisão
        % módulo


        EX:
        3 % 2 = 1
     /*

      Operadores unários
        + sinaliza positivo, sem esse simbolo números já são considerados positivos
        - nega um número ou uma expressão
        ++ incremento
        -- decremento
        ! operador lógico de negação

        EX:

         */
        int numero = 5;
        System.out.println(numero);
        numero = - numero; //maneira de tornar negativo
        System.out.println(numero);
        numero = numero * -1; //maneira de tornar positivo
        System.out.println(numero);

        //incrementar ++
        //decrementar --
        numero++; //vai incrementar depois
        ++numero; //vai incrementar antes
        System.out.println(numero);


        //negar boolean usando !
        boolean variavel = true;
        System.out.println(variavel);

        variavel = !variavel;

        int a = 4;
        int b = 4;
        //operador ternário
        String resultado = a==b ? "Certo" : "Errado";

        /*
        operadores lógicos
        && E
        || OU
         */

        boolean condicao1 = false;
        boolean condicao2= false;
        if(condicao1 && condicao2){
            System.out.println("As duas são verdadeiras");
        }else if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeiras");
        }else{
            System.out.println("Nenhuma é verdadeira");
        }
    }
}
