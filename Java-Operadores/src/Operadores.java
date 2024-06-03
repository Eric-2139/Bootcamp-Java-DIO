public class Operadores {
    public static void main(String[] args) {

        System.out.println("Atribuição");
        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);

        System.out.println("");

        System.out.println("Aritmético");
        int n = 5;
        System.out.println(- n);
        System.out.println(-- n);
        System.out.println(++ n);

        System.out.println("");

        System.out.println("Unário");
        boolean var = false;
        System.out.println(!var);

        System.out.println("");

        System.out.println("Ternário");
        int a = 5;
        int b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        System.out.println("");

        System.out.println("Relacional");
        int n1 = 10;
        int n2 = 11;
        boolean simNao = n1 == n2;
        System.out.println(simNao);
        simNao = n1 != n2;
        System.out.println(simNao);
        simNao = n1 < n2;
        System.out.println(simNao);
        simNao = n1 > n2;
        System.out.println(simNao);

        String nome1 = "Eric";
        String nome2 = new String("Eric");
        System.out.println(nome1.equals(nome2));

        System.out.println("");

        System.out.println("Lógico");
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("fim");
    }
}
