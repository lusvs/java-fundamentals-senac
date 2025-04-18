/******************************************************************************

Utilize a instrução switch e o laço/loop do-while para implementar uma
questão de múltipla escolha referente a alguma das outras disciplinas que você
está cursando neste semestre. Primeiro deverá ser apresentado o enunciado da
questão com as 5 opções/alternativas de resposta, que são (a), (b), (c), (d) e (e).
Depois que o usuário escolher uma opção, se for a resposta correta deverá ser
impresso “Resposta correta”, caso contrário “Resposta incorreta”. No caso de
“Resposta incorreta” a questão deve ser apresentada novamente para outra
tentativa. Deve ser permitido no máximo 3 tentativas, quando a resposta
correta for escolhida deve ser informado em qual tentativa isso ocorreu, caso
isso não ocorra em nenhuma das 3 tentativas deve ser impresso “Resposta
incorreta nas 3 tentativas”.

*******************************************************************************/
import java.util.Scanner;

public class ado6
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    int tentativas = 1;
	    boolean acertou = false;
	    
		System.out.println("Na materia de 'Usabilidade, Interface e UX' estamos aprendendo como fazer uma pagina adequada para nosso site, considerando oque aprendeu, responda a seguinte questão.\nQual das opções abaixo é a mais importante para garantir uma boa experiência do usuário em um site ou aplicativo?");

		System.out.println("A) - Ter um design visualmente complexo e cheio de elementos gráficos.");
		System.out.println("B) - Fazer o usuário clicar em várias opções para obter informações completas.");
		System.out.println("C) - Garantir que a navegação seja intuitiva e fácil de entender.");
		System.out.println("D) - Priorizar cores e fontes chamativas, independentemente da legibilidade.");
		System.out.println("E) - Tornar a interface o mais minimalista possível, removendo todas as funcionalidades.");
		
		do{
		System.out.println("Digite sua resposta: ");
		String resposta = entrada.next();
	
		switch(resposta){
		    case "c":
		        System.out.println("Resposta CORRETA");
		        System.out.println("Você acertou na " + tentativas + " tentativa.");
		        System.out.println("============================================");
		        acertou = true;
		        break;
		    default:
		        System.out.println("Resposta ERRADA");
		        System.out.println("tentativa numero " + tentativas + ".");
		        System.out.println("============================================");
		        tentativas++;
		        break;
		}
		} while(!acertou && tentativas <= 3);
		entrada.close();
	}
}