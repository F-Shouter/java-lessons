package school.sptech;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(
                "Anne Yukari Yamsaki",
                "(11) 95692-2441");

        conta1.depositar(50.00);
        conta1.sacar(10.00);
        conta1.exibirInformacao();
        System.out.println("Saldo Atual: " + conta1.getSaldo());
        conta1.setTelefone("(11) 95692-2440");

        ContaCorrente conta2 = new ContaCorrente(
                "Ricardo Bissaco Souza",
                "(11) 95692-9999", "anne.yamasaki@sptech.school");
        conta2.exibirInformacao();
    }
}
