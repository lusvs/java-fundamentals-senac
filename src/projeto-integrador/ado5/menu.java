/******************************************************************************
Crie um menu que permita o usuário escolher as seguintes opções para um
jogo:
1 – Instruções
2 – Jogar
3 – Créditos
4 – Sair
Utilize a estrutura switch dentro de um laço do-while, na implementação. O
menu deixará de ser mostrado apenas quando o usuário escolher a opção 4 –
Sair
*******************************************************************************/
import java.util.Scanner;
public class MenuJogo
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        int escolha; 
 
        do {
            System.out.println("Bem Vindo ao jogo! ");
            System.out.println("1- instruções\n2-jogar\n3-Creditos\n4-sair");
            System.out.println("Selecione uma das opções para prosseguir: ");   
            escolha = entrada.nextInt(); 

            switch (escolha){
                case 1:
                    System.out.println("Abrindo Instruções...");
                    break;
                case 2:
                    System.out.println("Iniciando jogo...");
                    break;
                case 3:
                    System.out.println("Creditos...");
                   break;
                case 4:
                    System.out.println("saindo do jogo...");
                    break;
            }
        }while(escolha!= 4);
    }
}   