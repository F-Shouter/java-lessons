package school.sptech;

public class Exemplo04 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println("Número atual: " + i);
        }
        // atalho fori
        int contador = 0;
        do {
            System.out.println("AAAH: " + contador);
            contador++;
        }
        while(contador < 10);
    }
}
