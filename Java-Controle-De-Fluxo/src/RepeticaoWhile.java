import java.util.concurrent.ThreadLocalRandom;;

public class RepeticaoWhile {
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    public static void main(String[] args) {
        double mesada = 50;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: R$" + valorDoce + "Adicionado no carrinho");
            mesada -= valorDoce;
            System.out.println("Mesada: " + mesada);

            System.out.println("");

            if (mesada == 0) {
            System.out.println("Joãozinho gastou toda a sua mesada em doces");
            }
        }
    }
}

