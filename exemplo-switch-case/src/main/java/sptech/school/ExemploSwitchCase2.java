package sptech.school;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExemploSwitchCase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        Integer numero = scanner.nextInt();
        String mensagem = null;

        switch (numero) {
            case 1 -> mensagem = "Domingo!";
            case 2 -> mensagem = "Segunda!";
            case 3 -> mensagem = "Terça!";
            case 4 -> mensagem = "Quarta!";
            case 5 -> mensagem = "Quinta!";
            case 6 -> mensagem = "Sexta!";
            case 7 -> mensagem = "Sábado!";
            default -> {
                mensagem = "Número inválido!";
                System.out.println("AAHHH");
            }
        }
        System.out.println(mensagem);
    }
}
