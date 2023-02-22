package OperadoresLogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /*
            Operadores Lógicos
            && e
            só é verdade true se ambos forem verdadeiros

            || ou
            é verdade se um dos dois forem verdade

            ^ xor
            só é verdade se ambos os valores forem opostos

            ! negação
            inverte o valor de true ou false


            quando utilizar? depende da necessidade


            Curiosidade:
            ELES NÃO SÃO OPERADORES Lógicos
            dificilmente irei utilizar são de baixissimo nível
            operadores bitwise: & e |
            operadores shift: ~, >>, >>>, <<


            EX DOS LÓGICOS:
         */
            boolean b1 = true;
            boolean b2 = false;
            boolean b3 = true;
            boolean b4 = false;
            int i1 =10;
            int i2 = 20;
            float f1 = 4.5f;
            float f2 = 3.5f;

        System.out.println("b1 && b2 = " + (b1 && b2)); // false
        System.out.println("b1 && b3 = " + (b1 && b3)); // true
        System.out.println("b2 || b3 = " + (b2 || b3)); // true
        System.out.println("b1 ^ b3 = " + (b1 ^ b3)); // false
        System.out.println("b4 ^ b1 = " + (b4 ^ b1)); // true
        System.out.println("!b1 = " + (!b1)); // false
        System.out.println("!b2 = " + (!b2)); // true
        System.out.println("(i1 > i2) || (f2 < f1) = " + ((i1 > i2) || (f2 < f1))); //true
        System.out.println("((i1 + i2) < (f2 - f1)) && true = " + ((i1 + i2) < (f2 - f1) && true)); //false

        //boas práticas armazenar expressões lógicas em variaveis para esclarecer melhor o uso

        double salarioMensal = 1099d;
        double mediaSalario = 1100d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe auxilio " + recebeAuxilio);
    }
}
