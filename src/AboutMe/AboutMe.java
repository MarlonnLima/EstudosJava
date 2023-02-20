package AboutMe;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //aqui estou instanciando a classe Scanner e definindo que vai ser utilizado a convensão americana
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Muito bem! agora eu preciso saber seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Ótimo! e qual é sua idade?");
        int idade = scanner.nextInt();
        // nesse caso o scanner está pegando oq foi recebido em formato string e convertendo para int
        System.out.println("Incrivel! só mais uma coisinha, qual a sua altura?");
        double altura = scanner.nextDouble();
        // nesse caso o scanner está pegando oq foi recebido em formato string e convertendo para double


        System.out.println("Olá me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
