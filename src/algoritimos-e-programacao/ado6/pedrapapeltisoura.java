import java.util.Scanner;
import java.util.Random;
    public class PedraPapelTesoura {
        public static int randInt(int min, int max) {
            Random rand = new Random();
            return rand.nextInt((max - min) + 1) + min;
        }
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Jogo: Pedra, Papel ou Tesoura");
            System.out.println("Digite o número da sua escolha:");
            System.out.println("0 - Pedra");
            System.out.println("1 - Papel");
            System.out.println("2 - Tesoura");
            System.out.print("Sua escolha: ");
            int jogador = teclado.nextInt();
            if (jogador < 0 || jogador > 2) {
                System.out.println("Escolha inválida! Digite 0, 1 ou 2.");
            return; 
            }
            int computador = randInt(0, 2);
            System.out.println("Você escolheu: " + nomeEscolha(jogador));
            System.out.println("Computador escolheu: " + nomeEscolha(computador));
            if (jogador == computador) {
                System.out.println("Empate!");
            } else if ((jogador == 0 && computador == 2) ||
                    (jogador == 1 && computador == 0) ||
                    (jogador == 2 && computador == 1)) {
                    System.out.println("Você venceu!");
            } else {
                    System.out.println("Computador venceu!");
            }
            teclado.close(); 
        }
        public static String nomeEscolha(int numero) {
            if (numero == 0) return "Pedra";
            else if (numero == 1) return "Papel";
            else return "Tesoura";
        }
    }