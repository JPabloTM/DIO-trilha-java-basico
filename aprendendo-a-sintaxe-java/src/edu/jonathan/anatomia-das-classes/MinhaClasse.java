public class MinhaClasse {
    public static void main (String[] args){
        
        String primeiroNome = "Jonathan";
        String segundoNome = "Pablo\n\n";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "\n\nRetorno do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}

