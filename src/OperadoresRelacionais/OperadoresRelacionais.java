package OperadoresRelacionais;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        //similaridade
        // == igualdade
        // != diferença

        //tamanho
        // > maior
        // > maior igual
        // < menor
        // <= menor igual

        //ex:
        int i1 =10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("Tabela de resultados dos da relações dos tipos");
        System.out.println("int");
        System.out.println("i1 == i2; " + (i1 == i2));
        System.out.println("i1 != i2; " + (i1 != i2));
        System.out.println("i1 > i2; " + (i1 > i2));
        System.out.println("i1 <= i2; " + (i1 <= i2));

        System.out.println("float");
        System.out.println("f1 == f2; " + (f1 == f2));
        System.out.println("f1 != f2; " + (f1 != f2));
        System.out.println("f1 >= f2; " + (f1 >= f2));
        System.out.println("f1 < f2; " + (f1 < f2));

        System.out.println("char");
        System.out.println("c1 == c2; " + (c1 == c2));
        System.out.println("c1 != c2; " + (c1 != c2));
        System.out.println("c1 > c2; " + (c1 > c2));
        System.out.println("c1 <= c2; " + (c1 <= c2));

        System.out.println("String");
        System.out.println("s1 == s2; " + (s1 == s2));
        System.out.println("s1 != s2; " + (s1 != s2));
        /*
        System.out.println("String não pode ser comparado por tamanho");
        System.out.println("s1 >= s2; " + (s1 >= s2));
        System.out.println("s1 < s2; " + (s1 < s2));
        */
        System.out.println("Boolean");
        System.out.println("b1 == b2; " + (b1 == b2));
        System.out.println("b1 != b2; " + (b1 != b2));
        /*
        System.out.println("Boolean não pode ser comparado por tamanho");
        System.out.println("b1 > b2; " + (b1 > b2));
        System.out.println("comparar tipos lógicos com numéricos não da certo");
        System.out.println("b1 <= i2; " + (b1 <= i2));
        */
        System.out.println("Aqui dá certo pois embora sejam tipos de dados diferentes ambos são numéricos");
        System.out.println("i2 > f1; " + (i2 > f1));
        //ex e comparações
        /*
        i1 == i2; false
        i1 != i2; true
        i1 > i2; false
        i1 <= i2; true

        f1 == f2; false
        f1 != f2; true
        f1 >= f2; true
        f1 < f2; false

        c1 == c2; false
        c1 != c2; true
        c1 > c2; false
        c1 <= c2; true

        s1 == s2; true
        s1 != s1; false
        STRING NÃO PODE SER COMPARADO POR TAMANHO
        s1 >= s2; ERROR
        s1 < s2; ERROR

        b1 == b2; false
        b1 != b2; true
        BOOLEAN NÃO PODE SER COMPARADO POR TAMANHO
        b1 > b2; ERROR
        b1 <= i1; ERROR


        //Aqui dá certo pois embora sejam tipos de dados diferentes ambos são numéricos
        i2 > f1; true
         */
    }
}
