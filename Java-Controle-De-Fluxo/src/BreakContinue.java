public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 0; numero <=10; numero
        ++) {
            if (numero == 3) {
                continue;
            }

            if (numero == 9) {
                break;
            }

            System.out.println(numero);
        }
    }
}
