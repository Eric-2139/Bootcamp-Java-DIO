import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

    public static void selecaoCandidatos() {
        String[] candidatos = { "Eric", "Matheus", "Eduardo", "Márcio", "Bonno", "Thallis", "Jefferson", "Arthur",
                "Yuri", "Álvaro", };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário" + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                System.out.println("");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void imprimirSelecionado() {
        String[] candidatos = { "Eric", "Matheus", "Eduardo", "Márcio", "Bonno" };

        System.out.println("Imprimindo a lista de candidatos informando o seu índice");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("");

        System.out.println("Forma abreviada com for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    public static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    public static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas: "
                    + tentativasRealizadas + " realizadas");
        }
    }

    public static void main(String[] args) {

        selecaoCandidatos();

        System.out.println("");

        imprimirSelecionado();

        System.out.println("");

        String[] candidatos = { "Eric", "Matheus", "Eduardo", "Márcio", "Bonno" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }
}
