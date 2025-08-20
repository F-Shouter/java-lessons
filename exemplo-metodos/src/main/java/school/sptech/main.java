package school.sptech;

public class main {
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Auxiliar auxiliar = new Auxiliar();
        //auxiliar.exibirBomDia();
        //auxiliar.exibirBomDia("Anne Yukari Yamasaki");
        //auxiliar.exibirBomDia("Ricardo", "Suzano - SP");

        Double media = auxiliar.calcularMedia(3.5, 40.6);
        System.out.println( ANSI_YELLOW + "\nMédia: " + media);
        Double notaFinal = media + 1.0;
        System.out.println( ANSI_YELLOW + "Sua nota final é: " + notaFinal);
    }
}
