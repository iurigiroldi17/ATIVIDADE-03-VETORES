import java.util.Scanner;

public class LeituradeValorespeloUsuario {
    public static void main(String[] args) {
        // Criar um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração e inicialização do vetor com 3 posições
        int[] vetor = new int[3];

        // Solicitar ao usuário que insira 3 números
        System.out.println("Digite 3 números inteiros:");

        // Ler os valores e armazená-los no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Fechar o scanner após a leitura dos valores
        scanner.close();

        // Exibir os valores inseridos
        System.out.println("Valores inseridos:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        // Calcular a média dos valores
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = (double) soma / vetor.length;

        // Exibir a média dos valores
        System.out.println("Média dos valores: " + media);
    }
}

