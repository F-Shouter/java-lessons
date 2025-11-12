package school.sptech;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(1, "Anne", "anne.com", "47219029", "@Ano1.");

        Usuario usuario2 = new Usuario(1, "Anne", "anne.com", "47219029", "@Ano1.");

        if (usuario1.equals(usuario2)) {
            System.out.println("Iguais");
        }else {
            System.out.println("Diferentes");
        }
    }
}
