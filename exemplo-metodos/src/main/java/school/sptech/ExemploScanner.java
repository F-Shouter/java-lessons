package school.sptech;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDigitado = scanner.nextLine();
        System.out.println("Você é o: " + nomeDigitado);

        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = scanner.nextInt();
        System.out.println("Você tem %d anos".formatted(idadeDigitada));

        System.out.println("Digite sua altura: ");
        Double alturaDigitada = scanner.nextDouble();
        System.out.println("Você tem %.2f metros".formatted(alturaDigitada));
    }
}
