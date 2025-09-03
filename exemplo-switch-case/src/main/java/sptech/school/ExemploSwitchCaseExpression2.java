package sptech.school;

import java.util.Scanner;

public class ExemploSwitchCaseExpression2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        Integer numero = scanner.nextInt();

        String mensagem = switch (numero) {
            case 1 -> "Domingo!";
            case 2 -> "Segunda!";
            case 3 -> "Terça!";
            case 4 -> "Quarta!";
            case 5 -> "Quinta!";
            case 6 -> "Sexta!";
            case 7 -> "Sábado!";
            default -> "Número inválido!";
        };
        System.out.println(mensagem);
    }
}
