package sptech.school;

public class BilheteUnico {

    String numero;
    String nomeUsuario;
    String cor;
    Double saldo;
    Boolean idoso;
    Boolean estudante;

    Boolean recarregar(Double valor) {
        if(valor < 5.0 || valor > 200.0){
            System.out.println("Valor inválido para recarga!");
            return false;
        }
        saldo += valor;
        System.out.println("Recaga com sucesso!");
        return true;
    }

    void passar(Boolean integracao){
        if (idoso || !integracao){
            System.out.println("Subsidio R$ 0.00");
            return;
        }
        Double valorPassagem = estudante ? 2.6 : 5.2;
        if (valorPassagem > saldo){
            System.out.println("Saldo insulficiente!");
            return;
        }
        saldo -= valorPassagem;
        System.out.println("Passou bilhete com sucesso!");
        System.out.println("Valor passado: " + valorPassagem);
        System.out.println("Saldo restante: " + saldo);
    }

    void printar(){
        String mensagem =
                """
                Número do bilhete: %s
                Nome do usuário: %s
                Cor: %s
                Saldo: %.2f
                Idoso: %b
                Estudante: %b
                """.formatted(numero, nomeUsuario, cor, saldo, idoso, estudante);
        System.out.println(mensagem);
    }
}
