import java.util.Scanner;

public class LeituradeNomespeloUsuario {
    public static void main(String[] args) {
        // Criar um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração e inicialização do vetor de strings com 3 posições
        String[] nomes = new String[3];

        // Solicitar ao usuário que insira 3 nomes
        System.out.println("Digite 3 nomes:");

        // Ler os nomes e armazená-los no vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine(); // Lê uma linha de texto
        }

        // Fechar o scanner após a leitura dos nomes
        scanner.close();

        // Exibir os nomes inseridos
        System.out.println("Nomes inseridos:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }
    }
}

