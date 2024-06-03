public class RepeticaoFor {
    public static void main(String[] args) {
        for (int carneirinhos = 0; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinhos: " + carneirinhos);
        }
        System.out.println("");

        String alunos[] = {"Felipe", "Daniela", "Jéssica", "Rebecca"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println(alunos[x]);
        }

        System.out.println("");

        //For Each
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

    }
}
