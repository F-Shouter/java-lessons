package school.sptech;

import java.util.Scanner;

public class Exemplo02Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Scanner scannerNumero = new Scanner(System.in);

        System.out.println("Idade: ");
        Integer idade = scanner.nextInt();
        //Integer idade = scannerNumero.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("--------------------------\nNome: %s \nIdade: %d anos".formatted(nome, idade));
    }
}
