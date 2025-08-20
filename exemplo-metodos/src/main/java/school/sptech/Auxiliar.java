package school.sptech;

public class Auxiliar {
    void exibirBomDia() {
        System.out.println("Bom dia Jovem!");
    }

    // Sobrecarga de metodos
    // com mesmo nome, mas diferentes tipos e quantidades de argumentos
    void exibirBomDia(String nome) {
        System.out.println("Bom dia, " + nome);
    }

    // Não funciona
    //void exibirBomDia(String local) {
    //    System.out.println("Bom dia, " + local);
    //}

    void exibirBomDia(String nome, String local) {
        System.out.println(String.format("Bom dia %s," +
                "Você está em: %s", nome, local));
    }

    Double calcularMedia(Double n1, Double n2) {
        Double media = (n1 + n2) /2.0;
        return media;
    }

    void validarIdade(Integer idade) {
        if(idade < 0){
            System.out.println("Inválido!!!");
            return; // não continua o que estiver embaxo
        }
        System.out.println("Válido!!!");
    }
}
