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
}
