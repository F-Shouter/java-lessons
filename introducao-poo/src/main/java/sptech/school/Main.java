package sptech.school;

public class Main {
    public static void main(String[] args) {

        BilheteUnico bilheteUnico1 = new BilheteUnico();
        bilheteUnico1.numero = "01251089";
        bilheteUnico1.nomeUsuario = "Anne Yukari Yamasaki";
        bilheteUnico1.idoso = false;
        bilheteUnico1.estudante = true;
        bilheteUnico1.cor = "Azul";
        bilheteUnico1.saldo = 0.0;

        BilheteUnico bilheteUnico2 = new BilheteUnico();
        bilheteUnico2.numero = "01251090";
        bilheteUnico2.nomeUsuario = "Ricardo Bissaco Souza";
        bilheteUnico2.idoso = true;
        bilheteUnico2.estudante = false;
        bilheteUnico2.cor = "Preto";
        bilheteUnico2.saldo = 100.0;

        System.out.println("---------------------------------");
        bilheteUnico1.printar();
        bilheteUnico1.recarregar(100.0);
        System.out.println("Saldo Atualizado: " + bilheteUnico1.saldo);
        bilheteUnico1.passar(true);
        System.out.println("---------------------------------");
        bilheteUnico2.printar();
        bilheteUnico2.recarregar(30.0);
        System.out.println("Saldo Atualizado: " + bilheteUnico2.saldo);
        bilheteUnico2.passar(true);
        System.out.println("---------------------------------\n");

    }
}
