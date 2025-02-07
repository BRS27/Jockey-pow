package JockeyPow;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Menu de Opções
        System.out.println("Bem-vindo ao Jokenpô!");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        // 2. Entrada do Jogador
        System.out.print("Digite sua escolha (1, 2 ou 3): ");
        int escolhaJogador = scanner.nextInt();

        // 3. Validação da Escolha do Jogador
        if (escolhaJogador < 1 || escolhaJogador > 3) {
            System.out.println("Escolha inválida. Por favor, digite 1, 2 ou 3.");
            scanner.close();
            return; // Encerra o programa
        }

        // 4. Escolha do Computador
        int escolhaComputador = random.nextInt(3) + 1; // Gera 1, 2 ou 3

        // 5. Exibição das Escolhas
        System.out.println("Você escolheu: " + escolhaParaString(escolhaJogador));
        System.out.println("O computador escolheu: " + escolhaParaString(escolhaComputador));

        // 6. Determinação do Vencedor
        String resultado = determinarVencedor(escolhaJogador, escolhaComputador);
        System.out.println(resultado);

        // 7. Encerramento
        scanner.close();
    }

    // 8. Método para Converter a Escolha em String
    public static String escolhaParaString(int escolha) {
        switch (escolha) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            default:
                return "Inválido";
        }
    }

    // 9. Método para Determinar o Vencedor
    public static String determinarVencedor(int escolhaJogador, int escolhaComputador) {
        if (escolhaJogador == escolhaComputador) {
            return "Empate!";
        } else if ((escolhaJogador == 1 && escolhaComputador == 3) ||
                   (escolhaJogador == 2 && escolhaComputador == 1) ||
                   (escolhaJogador == 3 && escolhaComputador == 2)) {
            return "Você venceu!";
        } else {
            return "O computador venceu!";
        }
    }
}

