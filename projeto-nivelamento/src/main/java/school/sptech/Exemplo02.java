package school.sptech;

public class Exemplo02 {
    public static void main(String[] args) {
        // if else
        Integer idade = 18;
        if(idade >= 18){
            System.out.println("Pode dirigir e votar...");
        }else if(idade >= 16){
            System.out.println("Pode votar...");
        }else{
            System.out.println("Nada...");
        }
    }
}
