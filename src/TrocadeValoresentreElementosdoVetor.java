public class TrocadeValoresentreElementosdoVetor {
    public static void main(String[] args) {
        // Declaração e inicialização do vetor
        int[] vetor = new int[2];
        vetor[0] = 5;  // Atribuindo valor 5 à primeira posição
        vetor[1] = 10; // Atribuindo valor 10 à segunda posição

        // Exibindo os valores antes da troca
        System.out.println("Antes da troca:");
        System.out.println("Posição 0: " + vetor[0]);
        System.out.println("Posição 1: " + vetor[1]);

        // Realizando a troca de valores
        int temp = vetor[0]; // Armazenando o valor da posição 0 em uma variável temporária
        vetor[0] = vetor[1]; // Atribuindo o valor da posição 1 à posição 0
        vetor[1] = temp; // Atribuindo o valor armazenado na variável temporária à posição 1

        // Exibindo os valores após a troca
        System.out.println("Depois da troca:");
        System.out.println("Posição 0: " + vetor[0]);
        System.out.println("Posição 1: " + vetor[1]);
    }
}

