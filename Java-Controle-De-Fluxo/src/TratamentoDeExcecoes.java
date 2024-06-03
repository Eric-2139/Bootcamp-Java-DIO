import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoDeExcecoes {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = scanner.next();

            System.out.print("Digite o seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.print("Digite a sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");

            scanner.close();
        } 
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
            System.out.println("O campo altura não pode conter vírgula e sim ponto, exemplo: 1.65");
        }

        
    }
}
