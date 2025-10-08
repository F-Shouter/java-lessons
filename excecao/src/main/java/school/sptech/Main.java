package school.sptech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exceptions consigo tratar em tempo de execução
        // - NullPointerException
        // - ClassCastException
        // - ArrayIndexOfBoundsException
        // - IOException

        // Errors não consigo tratar em tempo de execução
        // - StackOverflowError
        // - OutOfMemoryError

        Scanner leitor = new Scanner(System.in);

        try {

            System.out.println("n1: ");
            Integer n1 = leitor.nextInt();
            System.out.println("n2: ");
            Integer n2 = leitor.nextInt();
            System.out.println(n1 / n2);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
            e.getMessage(); // erro mostrado
            e.printStackTrace(); // erro mostrado com caminho
        }

//        } catch (InputMismatchException e) {
//            System.out.println("Digite um num válido!");
//
//        } catch (ArithmeticException e) {
//            System.out.println("Não é possível divisão por zero!");
//
//        }

    }
}
