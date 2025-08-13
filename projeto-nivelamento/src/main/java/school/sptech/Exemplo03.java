package school.sptech;

public class Exemplo03 {
    public static void main(String[] args) {
        String valor1 = "Manoel";
        String valor2 = "Manoel";

        if(valor1.equals(valor2)){
            //.equals para objetos, == para primitivos
            System.out.println("valores iguais");
        }else{
            System.out.println("valores diferentes");
        }
    }
}
