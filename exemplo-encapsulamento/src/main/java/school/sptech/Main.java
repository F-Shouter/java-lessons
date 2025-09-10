package school.sptech;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(
                "Anne Yukari Yamsaki",
                "(11) 95692-2441");

        conta1.depositar(50.00);
        conta1.sacar(10.00);
        conta1.exibirInformacao();

        ContaCorrente conta2 = new ContaCorrente(
                "Ricardo Bissaco Souza",
                "(11) 95692-9999");
        conta2.exibirInformacao();
    }
}
