package sptech.school;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExemploSwitchCaseExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        Integer numero = scanner.nextInt();

        String mensagem = switch (numero) {
            case 1: yield "Domingo!";
            case 2: yield "Segunda!";
            case 3: yield "Terça!";
            case 4: yield "Quarta!";
            case 5: yield "Quinta!";
            case 6: yield "Sexta!";
            case 7: yield "Sábado!";
            default: yield "Número inválido!";
        };
        System.out.println(mensagem);
    }
}
