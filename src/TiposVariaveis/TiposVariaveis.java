package TiposVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        //char utiliza aspas simples na declaração
        double salarioMinimo = 2500.33;
        //se um valor começar com zero talvez tenha que ser uma string
        //tipo float tem que ser colocado F no final, pode ser maiusculo ou minusculo
        //tipo long tem que terminar com L no final, pode ser maisculo ou minusculo

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        //short não pode receber um tipo de dado
        // maior que ele porque pode ser que em algum momento esse dado seja maior que o limite desse tipo
        short numeroCurto2 = (short)numeroNormal;

        //para definir que uma variavel é constante use final
        final double VALOR_DE_PI = 3.14;
     }
}
