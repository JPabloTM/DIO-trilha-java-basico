package edu.jonathan.operadores;

public class Operadores {
    
    public static void main (String [] args){
        
     /* String nomeCompleto = "\n\nLINGUAGEM " + "JAVA\n\n";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacaos = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        
        ---------------------------------------

        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);
        numero = -numero;
        System.out.println(numero);
        System.out.println(-numero);
        
        --------------------------------------

        int numero = 0;
        numero = numero + 2;
        System.out.println(numero);

        numero++;
        System.out.println(numero);
        numero-=1;
        System.out.println(numero--);
        System.out.println(numero);
        System.out.println(--numero);
    
    --------------------------------------------

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        variavel =! false;
        System.out.println(variavel);

    ---------------------------------------------
        
        int a, b;
        String resultado;

        a = 5;
        b = 6;

        if (a==b)
            resultado = "\nverdadeiro\n";
        else
            resultado = "\nfalso\n";

        System.out.println(resultado);
        
        ------------------------------------------
        
        int c, d;

        c = 5;
        d = 6;

        String resultado = c==d ? "\n\nverdadeiro\n" : "\n\nfalso\n";
        System.out.println(resultado);   
        
        --------------------------------------------------------------
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("\n\nNumero1 eh igual a numero2 ? " + simNao + "\n\n");

        simNao = numero1 != numero2;
        System.out.println("\n\nNumero1 eh diferente do numero2 ? " + simNao + "\n\n");

        simNao = numero1 > numero2;
        System.out.println("\n\nNumero1 eh maior que numero2 ? " + simNao + "\n\n");

        simNao = numero1 < numero2;
        System.out.println("\n\nNumero1 eh menor que numero2 ? " + simNao + "\n\n");

        ------------------------------------------------------------------------------

        String nomeUm = "Jonathan";
        String nomeDois = "Jonathan";

        System.out.println(nomeUm==nomeDois);

        ------------------------------------------------------------------------------

        String nomeUm = "Jonathan";
        String nomeDois = new String("Jonathan"); // Variável é diferente de objeto, tem que usar ( ~.equals(~)) para comparar

        System.out.println(nomeUm==nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        ------------------------------------------------------------------------------
        */
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2)
            System.out.println("As duas condições sao verdadeiras");
            
        else
            System.out.println("fim1");
        

        if(condicao1 || condicao2)
            System.out.println("Uma das condições sao verdadeiras");
            
        else
            System.out.println("fim2");
        
        
        if(condicao1 && (7>4))
            System.out.println("As duas condições sao verdadeiras");
          
        else
            System.out.println("fim3");

    }
}
