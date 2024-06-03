public class OperadorTernario {
    public static void main(String[] args) {
        int nota1 = 7;
        String resultado1 = nota1 >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado1);

        int nota2 = 8;
        String resultado2 = nota2 >= 7 ? "Aprovado" : nota2 >= 5 && nota2 < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado2);
    }
}
