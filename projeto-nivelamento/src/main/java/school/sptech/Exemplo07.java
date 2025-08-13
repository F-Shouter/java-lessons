package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Exemplo07 {
    public static void main(String[] args) {
        //Double numeroAleatorio = Math.random() * 10 + 10;

        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0,10);
        System.out.println(numeroAleatorio);

        Double numeroAleatorio2 = ThreadLocalRandom.current().nextDouble(0,10);
        System.out.println("%.2f".formatted(numeroAleatorio2));

        Boolean numeroAleatorio3 = ThreadLocalRandom.current().nextBoolean();
        System.out.println(numeroAleatorio3 ? "Cara" : "Coroa");

    }
}
