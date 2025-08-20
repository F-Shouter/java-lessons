package school.sptech;

public class Auxiliar {
    void exibirBomDia() {
        System.out.println("Bom dia Jovem!");
    }

    // Sobrecarga de metodos
    // com mesmo nome, mas diferentes argumentos
    void exibirBomDia(String nome) {
        System.out.println("Bom dia, " + nome);
    }
}
