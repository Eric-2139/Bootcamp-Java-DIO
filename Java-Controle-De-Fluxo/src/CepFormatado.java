public class CepFormatado {
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
        throw new CepInvalidoException();

        return "23.765-064";
    }  

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("29151240");
            System.out.println(cepFormatado);
        } 
        catch (CepInvalidoException e) {
            e.printStackTrace();
        }
    }
}
