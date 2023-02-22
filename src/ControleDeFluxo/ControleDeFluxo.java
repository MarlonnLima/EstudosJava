package ControleDeFluxo;

public class ControleDeFluxo {
    public static void main(String[] args) {
    /*
        são estruturas que tem capacidade de direcionar o fluxo do código
        Decisão: if, if-else, if-else-if,if-else-if-else, switch e ternário
        o operador ternário pode ser usuado sem else basta fazer assim: (condição) ? faça isso : null; assim vai ignorar o else
        deve ser evitado o uso do ternário ao maximo pois complica legibilidade
        repetição: for, while, do while
        interrupção: break, continue e return

        BOAS PRÁTICAS
        SWITCH é para valores exatos e IF para expressões booleanas
        Evitar usar o default do SWITCH para "cases genéricos" default não deve ser usado como padrão
        serve para indicar que o valor passado está errado
        Evitar o efeito flecha dos IF( causar um efeito de identação assim >)
        Evitar muitos IFs aninhados
        Usar a boa prática da aula 2 para diminuir o tamanho do if(criar variaveis intermediarias)
     */
        int mesDoAno = 1;

        if(mesDoAno == 1){
            System.out.println("Janeiro");
        }else if(mesDoAno == 2){
            System.out.println("Fevereiro");
        }else if(mesDoAno == 3){
            System.out.println("Março");
        }else if(mesDoAno == 4){
            System.out.println("Abril");
        }else if(mesDoAno == 5){
            System.out.println("Maio");
        }else if(mesDoAno == 6){
            System.out.println("Junho");
        }else if(mesDoAno == 7){
            System.out.println("Julho");
        }else if(mesDoAno == 8){
            System.out.println("Agosto");
        }else if(mesDoAno == 9){
            System.out.println("Setembro");
        }else if(mesDoAno == 10){
            System.out.println("Outubro");
        }else if(mesDoAno == 11){
            System.out.println("Novembro");
        }else if(mesDoAno == 12){
            System.out.println("Dezembro");
        }else{
            System.out.println("Mes indefinido");
        }



        String diaDaSemana = "Segunda";
        switch(diaDaSemana){
            case "Segunda":
                System.out.println(1);
                break;
            case "Terça":
                System.out.println(2);
                break;
            case "Quarta":
                System.out.println(3);
                break;
            case "Quinta":
                System.out.println(4);
                break;
            case "Sexta":
                System.out.println(5);
                break;
            case "Sábado":
                System.out.println(6);
                break;
            case "Domingo":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia indefinido");
                break;
        }

        int variavelInteiro = 1;
        switch(variavelInteiro){
            case 1:
            case 2:
            case 3:
                System.out.println("certo");
                break;
            case 4:
                System.out.println("errado");
                break;
            case 5:
                System.out.println("talvez");
                break;
            default:
                System.out.println("Valor indefinido");
        }

        switch(mesDoAno){
            case 12:
            case 1:
            case 7:
                System.out.println("Ferias");
                break;
            default:
                System.out.println("Não estamos de ferias");
        }

        /*
        Blocos
        locais: dentro de métodos
        estáticos: dentro de classes
        instância: dentro de classes

        bloco é tudo dentro de {

         isso é um bloco de execução

        }
         */
    }
}
