package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class ContaCorrente {

    //Atributos
    private String numero;
    private String titular;
    private String telefone;
    private Double saldo; //private só essa classe pode alterar
    private String email;

    //Construtores são métodos que iniciam os atributos e encapsula
    // public fora de outros pacotes
    public ContaCorrente(String titular, String telefone) {
        this.numero = "" + ThreadLocalRandom.current().nextInt(1000, 2000);
        this.saldo = 0.0;
        this.titular = titular;  //this = atributo da classe
        this.telefone = telefone;
    }

    public ContaCorrente(String titular, String telefone, String email) {
        this(titular, telefone);
        this.email = email;
    }


    public void depositar(Double valorDeposito) {
        if (valorDeposito == null || valorDeposito <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        saldo += valorDeposito;
        System.out.println("----------DEPOSITADO!----------");
    }

    public Double sacar(Double valorSaque) {
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

    public void exibirInformacao() {
        System.out.println("""
                \n-------------------------------
                ||       Conta Corrente      ||
                -------------------------------
                Número: %s
                Titular: %s
                Telefone: %s
                Saldo: R$ %.2f
                E-mail: %s\n
                """.formatted(numero, titular, telefone, saldo, email));
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
// Encapsulamento serve para controlar acesso e ocultar detalhes. Exemplo: micro-ondas
// manutenções, consistencia dos dados, protege e oculta
// métodos protegendo os atributos.
// private -
// default ~
// protect #
// public +
