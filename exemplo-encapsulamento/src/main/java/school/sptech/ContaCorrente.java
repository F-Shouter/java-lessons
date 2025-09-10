package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class ContaCorrente {

    //Atributos
    String numero;
    String titular;
    String telefone;
    Double saldo;

    //Construtores são métodos
    ContaCorrente(String titular, String telefone) {
        numero = "" + ThreadLocalRandom.current().nextInt(1000, 2000);
        saldo = 0.0;
        this.titular = titular;  //this = atributo da classe
        this.telefone = telefone;
    }

    void depositar(Double valorDeposito) {
        if (valorDeposito == null || valorDeposito <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        saldo += valorDeposito;
        System.out.println("----------DEPOSITADO!----------");
    }

    Double sacar(Double valorSaque) {
        if (valorSaque == null || valorSaque <= 0) {
            System.out.println("----------Valor inválido!----------");
            return 0.0;
        }
        if (valorSaque > saldo) {
            System.out.println("----------Saldo insuficiente!----------");
            return 0.0;
        }
        saldo -= valorSaque;
        System.out.println("----------SACADO!--------------");
        return valorSaque;
    }

    void exibirInformacao() {
        System.out.println("""
                \n-------------------------------
                ||       Conta Corrente      ||
                -------------------------------
                Número: %s
                Titular: %s
                Telefone: %s
                Saldo: R$ %.2f\n
                """.formatted(numero, titular, telefone, saldo));
    }
}
