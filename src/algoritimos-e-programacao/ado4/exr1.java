/******************************************************************************

Escreva um programa que pergunte ao usuario quantos alunos tem na sala dele, 
em seguida, atraves de um laço while pede ao usuario para que entre com as notas 
de todos os alunos da sala, um por vez. Por fim o programa mostrara 
a media aritimetica da sala.

*******************************************************************************/
import java.util.Scanner;

public class exr1
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	double nota, media, alunos;
	int soma = 0;
	int nAluno = 1;
	    
	System.out.println("Digite quantos alunos tem em sua sala: ");
	alunos = entrada.nextInt();
	
	while (nAluno <= alunos) {
	    System.out.println("Digite a nota do aluno: " + nAluno);
        nota = entrada.nextInt();
	    soma += nota;
	    nAluno++;
	}
	
	media = soma / alunos;
	System.out.println("A média da sala é: " + media);
	}
}