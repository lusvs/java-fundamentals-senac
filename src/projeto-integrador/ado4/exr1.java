/******************************************************************************

Implemente uma questão de múltipla escolha referente a alguma das outras
disciplinas que você está cursando neste semestre. Primeiro deverá ser apresentado
o enunciado da questão com as 5 opções/alternativas de resposta, que são (a), (b),
(c), (d) e (e). Depois que o usuário escolher uma opção, se for a resposta correta
deverá ser impresso “Resposta correta”, caso contrário “Resposta incorreta”.
Utilize a instrução switch, invés de if, na implementação

*******************************************************************************/
import java.util.Scanner;

public class MultiplaEscolha
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
		System.out.println("Na materia de 'Usabilidade, Interface e UX' estamos aprendendo como fazer uma pagina adequada para nosso site, considerando oque aprendeu, responda a seguinte questão. Qual das opções abaixo é a mais importante para garantir uma boa experiência do usuário em um site ou aplicativo?");

		System.out.println("A) - Ter um design visualmente complexo e cheio de elementos gráficos");
		System.out.println("B) - Fazer o usuário clicar em várias opções para obter informações completas");
		System.out.println("C) - Garantir que a navegação seja intuitiva e fácil de entender");
		System.out.println("D) - Priorizar cores e fontes chamativas, independentemente da legibilidade");
		System.out.println("E) - Tornar a interface o mais minimalista possível, removendo todas as funcionalidades");
		
		System.out.println("Digite sua resposta: ");
		String resposta = entrada.next();
		
		switch(resposta){
		    case "c":
		        System.out.println("Resposta CORRETA");
		        break;
		    default:
		        System.out.println("Resposta ERRADA");
		        break;
		}
	}
}