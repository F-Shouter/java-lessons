package school.sptech;

public class Exemplo06 {
    public static void main(String[] args) {
        //'Meu nome é ${nome}' / Javascript

       String nome = "Anne";
       Integer idade = 23;
       Double peso = 52.0;
       Float altura = 1.5f;

       String mensagem = String.format("Meu nome é: %s, tenho %d anos, " +
               "peso %.0fkg e tenho %.2f de altura", nome, idade, peso, altura);

        //String mensagem = ("Meu nome é: %s, tenho %d anos, " +
        //       "peso %.2fkg e tenho %.2f de altura").formatted(nome, idade, peso, altura);


        //Boolean = %b
        // "19%" NO
        // "19%%" YES

        System.out.println(mensagem);
    }
}
