import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho da roupa (P/M/G): ");
        String sigla = scan.next();

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            
            case "M":
                System.out.println("Médio");
                break;

            case "G":
                System.out.println("Grande");
                break;
        
            default:
                System.out.println("Não temos esse tamanho");
                break;
        }

        scan.close();
    }
}
