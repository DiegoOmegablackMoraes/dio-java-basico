public class MinhaClasse {
    public static void main(String[] args) {
        String meuNome = "Omegablack";
        int anoNascimento = 1987;
        boolean verdadeira  = true;

        String primeiroNome = "Omega";
        String segundoNome = "Black";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
