/******************************************************************************* 
 * 
ado 2 algoritimos de programação
Receber duas notas de um aluno, fazer a media, 
com if else determinar qual letra a media recebe
e com switch soltar a resposta.

*******************************************************************************/
import java.util.Scanner;

public class mediaLetra
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	float n1, n2, soma, media;
	String nome, resposta;
	    
	System.out.println("Digite seu nome: ");
	nome = entrada.next();
	
	System.out.println("Digite sua n1:");
	n1 = entrada.nextFloat();
	
	System.out.println("Digite sua n2:");
	n2 = entrada.nextFloat();
	
	soma = n1 + n2;
	media = soma / 2;
	resposta = "";
	
	   
	if ((media == 9) || (media == 10)) {
	    System.out.println("A");
	    resposta = "A";
	}
	    else if (media == 8){
	        System.out.println("B");
	        resposta = "B";
	    }
	    else if (media == 7){
	        System.out.println("C");
	        resposta = "C";
	    }
	    else if (media == 6){
	        System.out.println("D");
	        resposta = "D";
	    }
	    else if (media < 6){
	        System.out.println("E");
	        resposta = "E";
	    }
	  
	switch(resposta){
	    case "A":
	        System.out.println(nome + ", Sua nota foi " + media + ", então sua media é A.");
	        break;
	    case "B":
	        System.out.println(nome + ", , Sua nota foi " + media + ", então sua media é B.");
	        break;
	    case "C":
	        System.out.println(nome + ", Sua nota foi " + media + ", então sua media é C.");
	        break;
	    case "D":
	        System.out.println(nome + ", Sua nota foi " + media + ", então sua media é D.");
	        break;
	    case "E":
	        System.out.println(nome + ", Sua nota foi " + media + ", então sua media é E.");
	        break;
	    }
	}
}